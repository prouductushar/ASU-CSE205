public class MyBSTree<T extends Comparable <T>> implements ITree<T> {
   
	private Node root;
	private String asc = "";
	
	public void insert(T d){
	   if(root == null){
	      root = new Node(d);
	   }
	   else{
	      root.insert(d);
	   }
	}
	
	public boolean containsItem(T d){
	   
	   Node pointer = root;
	   boolean found = false;
	   
	   while(!found && pointer!=null){
	      
	      if(d.equals(pointer.data)){
	         found = true;
	      }
	      
	      else{
	         if(d.compareTo(pointer.data) < 0){
	            pointer = pointer.left;
	         }
	         
	         else if(d.compareTo(pointer.data) > 0){
	            pointer = pointer.right;
	         }
	      }
	   }
	   return found;
	}
	
	public int getSize(){
	   return size(root);
	}
	
	private int size(Node nd){
	   if (nd == null){
            return 0;
	   }
	   
      else{
         return(size(nd.left) + 1 + size(nd.right));
      }
   }
 
	public void printInOrder(){
	   order(root);
	}
  
	public String toString(){
	   orderRep(root);
	   return asc;
	}
	
	private void order(Node nd){
	   if (nd == null) {
	      return;
	   }
	   order(nd.left);
	   System.out.print(" "+nd.data);
	   order(nd.right);   
	}
	
	private void orderRep(Node nd){
	   if (nd == null) {
	      return;
	   }
	   orderRep(nd.left);
	   asc+=" "+nd.data;
	   orderRep(nd.right);   
	}
	
	class Node{
	   public T data;
	   public Node left;
	   public Node right;
	   
	   public Node(T d){
	      data = d;
	      left = null;
	      right = null;
	   }
	   
	   public void insert(T d){
         int diff = d.compareTo(data);
         if (diff < 0)
         {  
            if (left == null){ 
               left = new Node(d); 
            }
            else{ 
               left.insert(d); 
            }
         }
         else if (diff > 0)
         {  
            if (right == null){ 
               right = new Node(d); 
            }
            else{ 
               right.insert(d);
            }
         }
	   }
	}    
}
