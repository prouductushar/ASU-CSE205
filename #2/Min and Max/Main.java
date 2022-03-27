/*

Write a public static method named minAndMax that will take an int array as it's only argument. 
This method will return an int array. When called, and passed an array of int values, this method will return an array containing exactly two int values. 
The first value in the returned array will be the minimum of all the values in the argument array, 
and the second value in the returned array will be the maximum of all the values in the argument array.

*/

public class Main{
   public static int[] minAndMax(int[] arr){
     
      int min = arr[0];
      int max = arr[0];
     
      for(int i = 0; i < arr.length; i++){
        
         if(arr[i]>max){
            max = arr[i];
         }
        
         if(arr[i]<min){
            min = arr[i];
         }
      }
     
      int[] mm = new int[2];
      mm[0] = min;
      mm[1] = max;
      return mm;
   }
   
   public static void main(String[] args){
      int[] nums = {1,3,4};
      System.out.print(minAndMax(nums)[0]+" "+minAndMax(nums)[1]);
   }
}
