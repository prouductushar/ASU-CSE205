/*

Write a public static method named FahrenheitToKelvin that will take a single argument of type float and will return a float. 
When called, and passed a temperature value (in Fahrenheit), this method must compute and return the Kelvin temperature equivalent. 
You must also write a small program in the main method that will:

1. Prompt the user to enter a temperature value in Fahrenheit
2. Collect and store the user's input in a float variable
3. Call the FahrenheitToKelvin method, passing the user's input as an argument
4. Store the value returned by the FahrenheitToKelvin method in another float variable
5. Display the Kelvin equivalent value

*/

import java.util.Scanner;

public class TempConversion { 
   public static void main(String[] args) {
    // Below this comment: declare and instantiate a Scanner
    Scanner in = new Scanner(System.in);
      
    // Below this comment: declare any other variables you may need
    // to store the user's input and the Kelvin equivalent value
    float fahrenheit, kelvin;

    // Below this comment: collect the requried inputs from the user
    System.out.print("Enter temperature in Fahrenheit : ");
    fahrenheit = in.nextFloat();

    // Below this comment: call your FahrenheitToKelvin method
    kelvin = FahrenheitToKelvin(fahrenheit);

    // Below this comment: display the required results
    System.out.println();
    System.out.printf("%.2f%s%.2f%s%n",fahrenheit," degrees Fahrenheit is ",kelvin," degrees Kelvin");
          
   }
   
   // define your FahrenheitToKelvin method here below
   public static float FahrenheitToKelvin(float f){
      float k = (f - 32)*5/9 + 273.15f;
      return k;
   }
   
}
