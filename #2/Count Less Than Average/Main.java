/*

Write a public static method named countLessThanAverage that will take an int array as it's only argument. 
This method will return an int value. When called, and passed an array of int values, 
this method will compute and return the number of values in the argument array that are less than the average of all the values in the argument array.

*/

import java.util.*;

public class Main{
   public static int countLessThanAverage(int[] arr){
     
      int count = 0;
      int avg = 0;
     
      for(int i = 0; i < arr.length; i++){
         count++;
         avg+=arr[i];
      }
     
      avg = avg/count;
      int nCount = 0;

      for(int i = 0; i < arr.length; i++){
        
         if(arr[i]<avg){
            nCount++;
         }
      }
     
      return nCount;
   }
  
   public static void main(String[] args){
      int[] nums = {5,8,10,12,4};
      System.out.print(countLessThanAverage(nums));
   }
}
