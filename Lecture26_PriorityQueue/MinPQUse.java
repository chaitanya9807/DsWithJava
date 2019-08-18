package Lecture26_PriorityQueue;

public class MinPQUse {
    public static void InplaceHeapSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insertIntoVirtualHeap(arr, i);
        }
        for (int i = 0; i < arr.length; i++) {
            int val = removeFromVirtualHeap(arr, arr.length - i);
            arr[arr.length - i - 1] = val;
        }
    }

    private static int removeFromVirtualHeap(int[] arr, int heapSize) {
        int retval = arr[0];
        arr[0] = arr[heapSize - 1];
        int i = 0;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;
        while (leftIndex < heapSize - 1) {
            int minIndex = i;
            if (arr[leftIndex] < arr[minIndex]) {
                minIndex = leftIndex;
            }
            if ((rightIndex < heapSize - 1) && (arr[rightIndex] < arr[minIndex])) {
                minIndex = rightIndex;
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                i = minIndex;
                leftIndex = minIndex * 2 + 1;
                rightIndex = 2 * minIndex + 2;
            } else {
                break;
            }
        }
        return retval;
    }

    private static void insertIntoVirtualHeap(int[] arr, int childIndex) {
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            if (arr[childIndex] < arr[parentIndex]) {
                int temp = arr[parentIndex];
                arr[parentIndex] = arr[childIndex];
                arr[childIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 5, 4, 3};
//        MinPQClass queue = new MinPQClass();
//        for (int a : arr) {
//            queue.Insert(a);
//        }
//        while (!queue.isEmpty()) {
//            try {
//                System.out.print(queue.removeMin() + " ");
//            } catch (priorityQueueException e) {
//            }
//        }
        InplaceHeapSort(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
