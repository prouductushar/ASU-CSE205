// Complete the implementation of your MyLinkedList class in this file
import java.util.*;

public class MyLinkedList implements MyList {
    // Implement the required fields and methods here
    private Node head;
    private int size;
    
    public MyLinkedList(){
       head = null;
       size = 0;
    }
    
    public void append(Object ele){
       Node cNode = new Node();
       cNode.data = ele;
       if(head==null){
          head = cNode;
       }
       else{
          Node pointer = head;
          while(pointer.next!=null){
             pointer = pointer.next;
          }
          pointer.next = cNode;
       }
       size++;
    }
    
    public void insertAt(int pos, Object ele){
       if(pos<0 || pos>size){
          throw new NoSuchElementException("Index is incorrect.");
       }
       Node cNode = new Node();
       cNode.data = ele;
       if(pos==0){
          Node temp = head;
          cNode.next = temp;
          head = cNode;
       }
       else{
          Node pointer = head;
          int counter = 0;
          while(counter<pos-1){
             pointer = pointer.next;
             counter++;
          }
          Node temp = pointer.next;
          cNode.next = temp;
          pointer.next = cNode;
       }
       size++;
    }
    
    public void removeAt(int pos){
       if(pos<0 || pos>=size){
          throw new NoSuchElementException("Index is incorrect.");
       }
       if(pos==0){
          head = head.next;
       }
       else{
          Node pointer = head;
          int counter = 0;
          while(counter<pos-1){
             pointer = pointer.next;
             counter++;
          }
          pointer.next = pointer.next.next;
       }
       size--;
    }
    
    public Object getAt(int pos){
       if(pos<0 || pos>=size){
          throw new NoSuchElementException("Index is incorrect.");
       }
       Node pointer = head;
       if(pos==0){
          return head.data;
       }
       else{
          int counter = 0;
          while(counter<pos){
             pointer = pointer.next;
             counter++;
          }
          return pointer.data;
       }
    }
    
    public int getSize(){
       return size;
    }
   
	// Do not alter the code below 
	
	public MyListIterator getIterator() {
		return new MyLinkedListIterator();
	}
	
	private class MyLinkedListIterator implements MyListIterator {
		Node currentNode = null;

		@Override
		public Object next() {
			if (currentNode != null)
				currentNode = currentNode.next;
			else
				currentNode = head;

			return currentNode.data;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null)
				return currentNode.next != null;
			else
				return head != null;
		}
	}
	
	class Node {
		public Object data = null;
		public Node next = null;
	}
}
