public class MySorts{
   public static void mergesort(IList<Integer> obj){
      IList<Integer> newObj = new MyArrayList<Integer>();
      newObj = mergesortHelper(obj);
      for(int i = 0; i < obj.size(); i++){
         obj.set(i,newObj.get(i));
      }
   }
   
   private static IList<Integer> mergesortHelper(IList<Integer> obj){
      if(obj.size()==1){
         return obj;
      }
      else{
         return merge(mergesortHelper(getLeftHalf(obj)),mergesortHelper(getRightHalf(obj)));
      }
   }
  
   private static IList<Integer> getLeftHalf(IList<Integer> obj){
      IList<Integer> newObj = new MyArrayList<Integer>();
      for(int i = 0; i < obj.size()/2; i++){
         newObj.add(obj.get(i));
      }
      return newObj;
   }
   
   private static IList<Integer> getRightHalf(IList<Integer> obj){
      IList<Integer> newObj = new MyArrayList<Integer>();
      for(int i = obj.size()/2; i < obj.size(); i++){
         newObj.add(obj.get(i));
      }
      return newObj;
   }
   
   private static IList<Integer> merge(IList<Integer> obj1, IList<Integer> obj2){
      IList<Integer> newObj = new MyArrayList<Integer>();
      int i = 0;
      int j = 0;
      while(i < obj1.size() && j < obj2.size()){
         if(obj1.get(i) < obj2.get(j)){
            newObj.add(obj1.get(i));
            i++;
         }
         else{
            newObj.add(obj2.get(j));
            j++;
         }
      }
      
      while(i < obj1.size()){
         newObj.add(obj1.get(i));
         i++;
      }
      
      while(j < obj2.size()){
         newObj.add(obj2.get(j));
         j++;
      }
      
      return newObj;
   }
}
