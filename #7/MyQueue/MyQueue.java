// Complete the implementation of your MyArrayList class in this file
import java.util.NoSuchElementException;

public class MyQueue implements IQueue {
	private Object[] queue;
	private int size;
	private int currentCapacity;

	public MyQueue(){
	   queue = new Object[10];
	   size = 0;
	   currentCapacity = 10;
	}
	
	@Override
	public void enqueue(Object item) {
	   if(getSize()==currentCapacity){
	      currentCapacity+=10;
	      Object[] newQueue = new Object[currentCapacity];
	      for(int i = 0; i < size; i++){
	         newQueue[i] = queue[i];
	      }
	      queue = newQueue;
	   }
	   queue[size]=item;
	   size++;
	}

	@Override
	public Object dequeue() {
	   if(isEmpty()){
	      throw new NoSuchElementException("Error!");
	   }
	   else{
	      Object temp = queue[0];
	      for(int i = 0; i < size-1; i++){
	         queue[i] = queue[i+1];
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
	      Object ele = queue[0];
	      return ele;
	   }
	}

	@Override
	public int indexOf(Object item) {
	   int pos = 0;
	   boolean found = false;
	   for(int i = size-1; i > -1; i--){
	      if(queue[i].equals(item)){
	         pos = i;
	         System.out.println(i);
	         found = true;
	      }
	   }
	   if(found==true){
	      return pos;
	   }
	   else{
	      return -1;
	   }
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
