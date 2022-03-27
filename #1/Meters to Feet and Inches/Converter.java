/*

Write a public static method named MetersToFeetAndInches that will take a single argument of type float and will return a String. 
When called, and passed a distance value (in Meters), this method must compute and return a String value with the equivalent distance in Feet and Inches.

You must also write a small program in the main method that will:

1. Prompt the user to enter a distance in Meters
2. Collect and store the user's input in a float variable
3. Call the MetersToFeetAndInches method, passing the user's input as an argument
4. Store the value returned by the MetersToFeetAndInches method in another String variable
5. Display the Feet and Inches equivalent value

*/

import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner in = new Scanner(System.in);
      
      // Below this comment: declare any other variables you may need
      // to store the user's input and the Feet and Inches equivalent value
      float m;
      String ftAndin;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter distance in meters : ");
      m = in.nextFloat();
      
      // Below this comment: call your MetersToFeetAndInches method
      ftAndin = MetersToFeetAndInches(m);
      // Below this comment: disply the required results
      System.out.printf("%.2f%s%s%n",m," meters in Feet and Inches is : ",ftAndin);
   }
   
   // define your MetersToFeetAndInches method here below
   public static String MetersToFeetAndInches(float m){
      float in = m * 39.37f;
      int ft = (int)in / 12;
      in = in % 12f;
      in = in;
      String ftIn = ""+ft+"\' ";
      String ftIn2 = "\"";
      String ftInFinal = String.format("%s%.2f%s",ftIn,in,ftIn2);
      return ftInFinal;
   }
   
}
