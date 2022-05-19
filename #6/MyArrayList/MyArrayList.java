// Complete the implementation of your MyArrayList class in this file
import java.util.*;

public class MyArrayList implements MyList {
    // Implement the required fields and methods here
    private int currentCapacity;
    private int size;
    private Object[] storage;
    
    public MyArrayList(){
       currentCapacity = 8;
       size = 0;
       storage = new Object[8];
    }
    
    public void append(Object x){
       if(size==currentCapacity){
          makeCapacity(size*2);
       }
       storage[size] = x;
       size++;
    }
    
    public void insertAt(int index, Object item){
       if(index<0 || index>size){
          throw new NoSuchElementException("Index is incorrect.");
       }
       if(size==currentCapacity){
          makeCapacity(size*2);
       }
       int pos = size;
       while(pos>0){
          storage[pos] = storage[pos-1];
          pos--;
       }
       storage[index] = item;
       size++;
    }
    
    public void removeAt(int index){
       if(index<0 || index>=size){
          throw new NoSuchElementException("Index is incorrect.");
       }
       int pos = index;
       while(pos<size){
          storage[pos]=storage[pos+1];
          pos++;
       }
       size--;
    }
    
    public Object getAt(int index){
       if(index<0 || index>=size){
          throw new NoSuchElementException("Index is incorrect.");
       }
       return storage[index];
    }
    
    public int getSize(){
       return size;
    }
    
    public void makeCapacity(int minCapacity){
       if(!(minCapacity<size || currentCapacity==minCapacity)){
          if(minCapacity<8){
             currentCapacity = 8;
          }
          else{
             currentCapacity = minCapacity;
             Object[] storageTemp = new Object[minCapacity];
             int ch = 0;
             while(ch<size){
                storageTemp[ch] = storage[ch];
                ch++;
             }
             storage = storageTemp;
          }
       }
    }
    
    public void trimExcess(){
       makeCapacity(size);
    }
    
    // Do not alter the code below 
    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator();
    }
    
    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = -1;

        @Override
        public Object next() {
            ++currentIndex;
            return storage[currentIndex];
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size - 1;
        }
    }   
}
