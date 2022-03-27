/*

Write a public static method named range that will take an int array as it's only argument. 
This method will return an int value. When called, and passed an array of int values, 
this method will compute and return the positive difference between the minimum of all the values in the argument array, 
and the maximum of all the values in the argument array.

*/

public class Main{
   public static int range(int[] arr){
     
      int min = arr[0];
      int max = arr[0];
     
      for(int i = 0; i < arr.length; i++){
        
         if(arr[i]<min){
            min = arr[i];
         }
        
         if(arr[i]>max){
            max = arr[i];
         }
      }
     
      int range = max - min;
      return range;
   }
   
   public static void main(String[] args){
      int[] nums = {4,5,3,7,1};
      System.out.print(range(nums));
   }
}
