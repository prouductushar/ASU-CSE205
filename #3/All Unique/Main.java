/*

Write a public static method named allUnique that will take an ArrayList<Integer> as an argument. 
This method will return an ArrayList<Integer>. When called and passed anArrayList, 
this method will return an ArrayList containing all the elements in the argument ArrayList that are only in the argument ArrayList one time. 
The values in the returned ArrayList must be in the same order as they are in the argument ArrayList.

*/

import java.util.*;

public class Main{
   public static ArrayList<Integer> allUnique(ArrayList<Integer> arr){
     
      ArrayList<Integer> unique = new ArrayList<Integer>();
     
      for(int i = 0; i < arr.size(); i++){
         int count = 0;
         for(int j = 0; j < arr.size(); j++){
            if(arr.get(i)==arr.get(j)){
               count++;
            }
         }
        
         if(count==1){
            unique.add(arr.get(i));
         }
      }
     
      return unique;
   }
  
   public static void main(String[] args){
   }
}
