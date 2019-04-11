package Lecture17_StacksAndQueue;

public class Caller {
    public static void main(String[] args){
//        Stack_ImplementationUsingArray s = new Stack_ImplementationUsingArray();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.peek());
//        System.out.println(s.pop());
        QueueImplementationUsingArray queue=new QueueImplementationUsingArray();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.print(queue.front());
        System.out.print(queue.dequeue());
    }
}
