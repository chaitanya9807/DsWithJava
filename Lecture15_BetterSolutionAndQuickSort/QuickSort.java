package Lecture15_BetterSolutionAndQuickSort;

import java.util.Scanner;

public class QuickSort {
    public static Scanner s = new Scanner(System.in);

    public static int[] readArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int partition(int[] arr, int sI, int eI) {
        int pivot = arr[sI];
        int count = 0;
        for (int i = sI + 1; i <= eI; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }
        int pivotpos = sI + count;
        int temp = arr[pivotpos];
        arr[pivotpos] = arr[sI];
        arr[sI] = temp;
        for (int i = sI, j = eI; j > pivotpos && i < pivotpos; ) {
            if (arr[i] < pivot) {
                i++;
            } else if (arr[j] >= pivot) {
                j--;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotpos;
    }

    public static void Sort(int[] arr, int sI, int eI) {
        if (sI >= eI) {
            return;
        }
        int pivot = partition(arr, sI, eI);
        Sort(arr, sI, pivot - 1);
        Sort(arr, pivot + 1, eI);
    }

    public static void main(String[] args) {
        int[] arr = readArray();
        Sort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}