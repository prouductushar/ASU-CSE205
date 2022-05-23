public class MySorts {
   public static void quicksort(IList<Integer> obj){
      quicksortHelper(obj,0,obj.size()-1);
   }
   
   private static void quicksortHelper(IList<Integer> obj, int i1, int i2){
      if(i1 < i2){
         int p = partition(obj,i1,i2);
         quicksortHelper(obj,i1,i2-1);
         quicksortHelper(obj,i1+1,i2);
      }
   }
   
   private static int partition(IList<Integer> obj, int i1, int i2){
      int pivot = obj.get(i2);
      
      for(int i = i1; i < i2; i++){
         if(obj.get(i) < pivot){
            swap(obj,i,i1);
            i1++;
         }
      }
      obj.set(i2,obj.get(i1));
      obj.set(i1,pivot);
      return i1;
   }
   
   private static void swap(IList<Integer> obj, int i1, int i2){
      int temp = obj.get(i1);
      obj.set(i1,obj.get(i2));
      obj.set(i2,temp);
   }
}
