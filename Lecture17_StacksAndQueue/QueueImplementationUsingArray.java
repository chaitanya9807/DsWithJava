package Lecture17_StacksAndQueue;

public class QueueImplementationUsingArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueueImplementationUsingArray() {
        data = new int[5];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Boolean isEmpty() {
        return getSize() == 0;
    }

    public Boolean isFull() {
        return getSize() == data.length;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            if (front == -1) {
                front++;
            }
            rear = (rear + 1) % data.length;
            data[rear] = element;
            size++;
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int element = data[front];
            front = (front + 1) % data.length;
            size--;
            if (getSize() == 0) {
                rear = -1;
                front = -1;
            }
            return element;
        } else {
            return -1;
        }
    }

    public int front() {
        if (!isEmpty()) {
            int element = data[front];
            return element;
        } else {
            return -1;
        }
    }
}
