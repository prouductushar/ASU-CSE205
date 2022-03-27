/*

Write a public static method named oddAndEven that will take an int array as it's only argument. 
This method will return an int array. When called, and passed an array of int values, this method will return an array containing exactly two int values. 
The first value in the returned array will be the count of all the odd values in the argument array, 
and the second value in the returned array will be the count of all the even values in the argument array.

*/

public class Main{
   public static int[] oddAndEven(int[] arr){
     
      int odd = 0; 
      int even = 0;
      int[] oe = new int[2];
     
      for(int i = 0; i < arr.length; i++){
        
         if(arr[i]%2==0){
            even++;
         }
        
         else{
            odd++;
         }
      }
     
      oe[0] = odd;
      oe[1] = even;
      return oe;
   }
   
   public static void main(String[] args){
      int[] nums = {4,5,6,7,8};
      System.out.print(oddAndEven(nums)[0]+"  "+oddAndEven(nums)[1]);
   }
}
