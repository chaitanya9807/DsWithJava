package Lecture18_19_20_LinkedList;

public class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    public LinkedListNode(T data){
        this.data=data;
    }

    public String toString(){
        return "Data : " + data;
    }
}
