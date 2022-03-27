/*

Write a public static method named nameToInitials that will take a single argument of type String and will return a String. 
When called, and passed a name, this method must compute and return a String value with the initials for the given name.

You must also write a small program in the main method that will:

1. Prompt the user to enter a name
2. Collect and store the user's input in a String variable
3. Call the nameToInitials method, passing the user's input as an argument
4. Store the value returned by the nameToInitials method in another String variable
5. Display the name and initials

*/

// Below this comment: import the Scanner
import java.util.Scanner;

public class Initials {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner in = new Scanner(System.in);
      
      // Below this comment: declare any other variables you may need
      String str, initials;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter Name : ");
      str = in.nextLine();
      
      // Below this comment: call your required method
      initials = nameToInitials(str);
      
      // Below this comment: disply the required results
      System.out.println("Initials for "+str+" : "+initials);
   }
   
   // define your required method here below
   public static String nameToInitials(String str){
      String[] words = str.split(" ");
      String ini = "";
      for(int i = 0; i < words.length; i++){
         if(i == words.length-1){
            ini+=words[i].charAt(0)+".";
         }
         else{
            ini+=words[i].charAt(0)+". ";
         }
      }
      return ini;
   }
   
}
