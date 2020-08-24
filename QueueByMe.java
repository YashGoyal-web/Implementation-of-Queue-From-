package queueByMe;
import myLinkedList.myLinkedList;

public class queueByMe<E> {
    
    myLinkedList<E> myLL = new myLinkedList();
    
    
    public void add(E data){
      myLL.add(data);
    }
    
     public  E remove() throws Exception{
       
        if(myLL.head == null){
            throw new Exception("Stack is Empty");
        }else{
            return myLL.removeAtFirst();
        }
    }
    
    public E element() throws Exception{
        if(myLL.head == null){
            throw new Exception("Stack is Empty");
        }else{
            return myLL.firstElement();
        }
    }
    
    public void offer(E data){
      myLL.add(data);        
    }
    
    public E poll(){
        if(myLL.head == null){
            return null;
        }else{
            return myLL.removeAtFirst();
        }
    }
    
    public E peek(){
        if(myLL.head == null){
            return null;
        }else{
            return myLL.firstElement();
        }
    }
    
}
