/*

Write a public static method named DiffMinMax3 that will take three arguments of type int and will return a int. 
When called, and passed three int values, this method must compute and return the positive difference between the minimum and maximum of the three argument values.

Note: Do not use Math.min or Math.max methods for this assignment.

*/

public class Main {
   public static void main(String[] agrs) {
      // you may write code in this main method to test your required method
      int a = 1;
      int b = 2;
      int c = 3;
      System.out.print(DiffMinMax3(a,b,c));
   }
   
   // define your required method here below
   public static int DiffMinMax3(int i1, int i2, int i3){
     
      int max,min,diff;
     
      if(i1 > i2 && i1 > i3){
         max = i1;
         if(i2 > i3){
            min = i3;
         }
         else{
            min = i2;
         }
      }
     
      else if(i2 > i1 && i2 > i3){
         max = i2;
         if(i1 > i3){
            min = i3;
         }
         else{
            min = i1;
         }
      }
     
      else{
         max = i3;
         if(i1 > i2){
            min = i2;
         }
         else{
            min = i1;
         }
      }
     
      diff = max - min;
      return diff;
   }
}
