package Lecture26_PriorityQueue;

import java.util.ArrayList;

class priorityQueueException extends Exception {
}

public class MinPQClass {
    private ArrayList<Integer> heap;

    public MinPQClass() {
        heap = new ArrayList<>();
    }

    public int getSize() {
        return heap.size();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void Insert(int element) {
        heap.add(element);
        int childIndex = getSize() - 1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                break;
            }
        }
    }

    public int getMin() throws priorityQueueException {
        if (getSize() == 0) {
            throw new priorityQueueException();
        }
        return heap.get(0);
    }

    public int removeMin() throws priorityQueueException {
        if (isEmpty()) {
            throw new priorityQueueException();
        }
        int retVal = heap.get(0);
        heap.set(0, heap.get(getSize() - 1));
        heap.remove(getSize() - 1);
        if (getSize() > 1) {
            downHeapify(0);
        }
        return retVal;
    }

    private void downHeapify(int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int minIndex = i;
        if (leftChild >= getSize()) {
            return;
        }
        if (heap.get(leftChild) < heap.get(minIndex)) {
            minIndex = leftChild;
        }
        if (rightChild < getSize() && (heap.get(rightChild) < heap.get(minIndex))) {
            minIndex = rightChild;
        }
        if (minIndex != i) {
            int temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(i));
            heap.set(i, temp);
            String str = String.valueOf(10);
            downHeapify(minIndex);
        }
    }
}