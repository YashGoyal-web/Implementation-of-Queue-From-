package myqueue;
import queueByMe.queueByMe;

public class MyQueue {

    public static void main(String[] args) {
    
        queueByMe<Integer> q = new queueByMe();
        
        q.offer(12);
        q.offer(2);
        q.offer(123);
        q.offer(45);
        q.offer(145);
        q.offer(445);
                
            System.out.println(q.poll());
            System.out.println(q.poll());
            System.out.println(q.poll());
            System.out.println(q.poll());
            System.out.println(q.poll());
            q.offer(451);
            System.out.println(q.poll());
            System.out.println(q.peek());
    }   
}
