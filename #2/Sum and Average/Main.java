/*

Write a public static method named sumAndAvg that will take an int array as it's only argument. This method will return a double array. 
When called, and passed an array of int values, this method will return an array containing exactly two double values. 
The first value in the returned array will be the sum of all the values in the argument array, 
and the second value in the returned array will be the average of all the values in the argument array.

*/

public class Main{
   public static double[] sumAndAvg(int[] arr){
     
      double[] sumAavg = new double[2];
      double sum = 0;
      int count = 0;
     
      for(int i = 0; i < arr.length; i++){
         sum+=arr[i];
         count++;
      }
     
      double avg = sum/count;
      sumAavg[0] = sum;
      sumAavg[1] = avg;
      return sumAavg;
   }
   
   public static void main(String[] args){
      int[] m = new int[3];
      m[0]=1;
      m[1]=2;
      m[2]=4;
      System.out.println(sumAndAvg(m));
   }
}
   
