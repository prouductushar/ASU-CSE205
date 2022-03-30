/*

Write a public static method named lessThanAverage that will take an ArrayList<Integer> as an argument. 
This method will return an ArrayList<Integer>. When called and passed an ArrayList, 
this method will return an ArrayList containing all the elements in the argument ArrayList that are less than the average of all the values in the argument ArrayList. 
The values in the returned ArrayList must be in the same order as they are in the argument ArrayList.

*/
import java.util.*;

public class Main{
  
   public static ArrayList<Integer> lessThanAverage(ArrayList<Integer> arr){
     
      double avg = 0;
      int count = 0;
      ArrayList<Integer> smArr = new ArrayList<Integer>();
     
      for(int i = 0; i < arr.size(); i++){
         avg+=arr.get(i);
         count++;
      }
     
      avg=avg/count;
     
      for(int i = 0; i < arr.size(); i++){
         if(arr.get(i)<avg){
            smArr.add(arr.get(i));
         }
      }
      return smArr;
   }
  
   public static void main(String[] args){
   }
}
         
