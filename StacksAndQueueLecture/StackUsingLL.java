package Codezen_Codes.StacksAndQueueLecture;

public class StackUsingLL<T> {
    private Node head;
    private Node temp;
    private int size;

    public StackUsingLL() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void push(T data) {
        if (size() == 0) {
            Node<T> newNode = new Node<T>(data);
            head = newNode;
        } else {
            Node<T> newNode = new Node<T>(data);
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T pop() throws StackEmptyException {
        if (size() == 0) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        T data = (T) head.data;
        head=head.next;
        size--;
        return data;
    }

    public T top() throws StackEmptyException {
        if (size() == 0) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return (T) head.data;
    }
}