/*

Write a public static method named inBoth that will take two ArrayList<Integer> arguments. 
This method will return an ArrayList<Integer>. When called and passed two ArrayList arguments, 
this method will return an ArrayList containing all the elements that are in both argument ArrayList objects. 
There should be no duplicate values in the returned ArrayList, 
and the values in the returned ArrayList must be in the same order as they are in the first argument ArrayList.

*/

import java.util.*;

public class Main{
   public static ArrayList<Integer> inBoth(ArrayList<Integer> a, ArrayList<Integer> b){
     
      ArrayList<Integer> common = new ArrayList<Integer>();
     
      for(int i = 0; i < a.size(); i++){
         for(int j = 0; j < b.size(); j++){
            if(a.get(i)==b.get(j) && !common.contains(a.get(i))){
               common.add(a.get(i));
            }
         }
      }
     
      return c;
   }
  
   public static void main(String[] args){
   }
}
