import java.util.NoSuchElementException;

public class MyStack implements IStack {
	private Object[] stack;
	private int size;
	private int currentCapacity;
	
	public MyStack(){
	   stack = new Object[10];
	   size = 0;
	   currentCapacity = 10;
	}
	
	@Override
	public void push(Object item) {
	   if(getSize()==currentCapacity){
	      currentCapacity+=10;
	      Object[] newStack = new Object[currentCapacity];
	      for(int i = 0; i < size; i++){
	         newStack[i] = stack[i];
	      }
	      stack = newStack;
	   }
	   for(int i = size; i > 0; i--){
	      stack[i] = stack[i-1];
	   }
	   stack[0] = item;
	   size++;
	}

	@Override
	public Object pop() {
	   if(isEmpty()){
	      throw new NoSuchElementException("Error!");
	   }
	   else{
	      Object temp = stack[0];
	      for(int i = 0; i < size-1; i++){
	         stack[i] = stack[i+1];
	      }
	      size--;
	      return temp;
	   }
	}

	@Override
	public Object peek() {
	   if(isEmpty()){
	      throw new NoSuchElementException("Error!");
	   }
	   else{
	      Object ele = stack[0];
	      return ele;
	   }
	}

	@Override
	public int indexOf(Object item) {
	   int pos = -1;
	   for(int i = 0; i < size; i++){
	      if(stack[i].equals(item)){
	         pos = i;
	      }
	   }
	   return pos;
	}

	@Override
	public int getSize() {
	   return size;
	}

	@Override
	public boolean isEmpty() {
	   if(size==0){
	      return true;
	   }
	   else{
	      return false;
	   }
	}

	// add any necessary methods or classes below
}
