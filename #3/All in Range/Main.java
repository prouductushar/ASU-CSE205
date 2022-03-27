/*

Write a public static method named inRange that will take an ArrayList<Integer>, and two additional int values as arguments. 
This method will return an ArrayList<Integer>. When called, and passed an ArrayList and a min value and a max value, 
this method will return an ArrayList containing all the elements in the argument ArrayList that are between the second argument value and the third argument value. 
You can safely assume that the second argument value will always be less than or equal to the third argument value. 
The values in the returned ArrayList must be in the same order as they are in the argument ArrayList.

*/

import java.util.*;

public class Main{
   public static ArrayList<Integer> inRange(ArrayList<Integer> a, int b, int c){
     
      int start = 0;
      int stop = 0;
      int count = 0;
     
      for(int i = 0; i < a.size(); i++){
        
         if(a.get(i)==b && count==0){
            start = i;
            count++;
         }
        
         if(a.get(i)==c){
            stop = i+1;
         }
      }
     
      if(stop==0 && count>0){
         stop = a.size();
      }
     
      ArrayList<Integer> d = new ArrayList<Integer>();
     
      for(int i = start; i < stop; i++){
        
         if(stop==a.size()){
            if(a.get(i)>=b){
               d.add(a.get(i));
            }
         }
        
         else{
            d.add(a.get(i));
         }
      }
     
      return d;
  }
  
  public static void main(String[] args){
  }
}
         
