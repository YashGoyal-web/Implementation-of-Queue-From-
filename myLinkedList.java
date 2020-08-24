package myLinkedList;

public class myLinkedList<E> {
    

   private class Node{
    
    E data;
    Node next;
    
    Node(E data){
        this.data = data;
        next = null;
    }
}
    
     public Node head;
    
    int item;
    
    public void add(E data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }else{
            Node temp = head;
            
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }
    }
    
     public void addDataAtPosition(E data , int index){
        
        Node node = head;
        Node temp = null;
        Node toInsert = new Node(data);
                
        if(index == 1){
            toInsert.next = head;
            head = toInsert;    
        }else{        

        int i=1;
        while(node != null && i<=index){
            temp = node;
            node = node.next;
            i++;
        }
        
        if(node == null && i!= index){
            System.out.println("Index is greater than linked list size");
        }else{
            temp.next = toInsert;
            toInsert.next = node;
        }        
        }
  }
     
     
     public E removeAtFirst(){
         if(head == null){
             System.out.println("Empty data");
             return null;
         }else{
             E data = head.data;
             head = head.next;
             return data;
         }
     }
     
     public E firstElement(){
         if(head == null){
             System.out.println("Empty data");
             return null;
         }else{
             return head.data;
         }
     }
     
    public void show(){
        
        if(head == null){
            System.out.println("Nothing to print");
        }else{
            Node temp = head;
            
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }     
    }        
}
