package Codezen_Codes.StacksAndQueueLecture;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    private Node<T> temp;
    private int size;

    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (size() == 0) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public Boolean isEmpty() {
        return size() == 0;
    }

    public T dequeue() throws QueueEmptyException {
        if (size() == 0) {
            throw new QueueEmptyException();
        }
        T data = front.data;
        size--;
        if (size() == 0) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        return data;
    }

    public T front() throws QueueEmptyException {
        if (size() == 0) {
            throw new QueueEmptyException();
        }
        return front.data;
    }

}
