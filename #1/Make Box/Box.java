/*

Write a java program that will collect the following 4 inputs from the user:

1. Height of the box
2. Width of the box
3. Border character
4. Interior character

Your program must collect the inputs in the order described above.
With these inputs, your program must print out a box made of the border and interior characters, and with the specified height and width.

*/

// Below this comment: import the Scanner
import java.util.Scanner;

public class Box {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner in = new Scanner(System.in);
      
      // Below this comment: declare any other variables you may need
      int h,w;
      String b,i;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter height   : ");
      h = in.nextInt();
      System.out.print("Enter width    : ");
      w = in.nextInt();
      System.out.print("Enter border   : ");
      b = in.next();
      System.out.print("Enter interior : ");
      i = in.next();
      
      // Below this comment: disply the required results
      System.out.println();
     
      for(int j = 0; j < h; j++){
         System.out.print(b);
        
         for(int k = 1; k < w - 1; k++){
           
            if(j == 0 || j == h - 1){
               System.out.print(b);
            }
           
            else{
               System.out.print(i);
            }
           
         }
         System.out.print(b+"\n");
  
      }
   }
}
