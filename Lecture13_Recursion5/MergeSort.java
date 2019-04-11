package Lecture13_Recursion5;

import java.util.Scanner;

public class MergeSort {
    public static Scanner s = new Scanner(System.in);

    public static int[] readArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MergeSort(int[] arr, int sI, int eI) {
        int mid = (sI + eI) / 2;
        int[] arr1 = new int[eI - sI + 1];
        int i = sI, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= eI) {
            if (arr[i] < arr[j]) {
                arr1[k++] = arr[i++];
            } else {
                arr1[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            arr1[k++] = arr[i++];
        }
        while (j <= eI) {
            arr1[k++] = arr[j++];
        }
        for (i = 0; i < arr1.length; i++) {
            arr[i + sI] = arr1[i];
        }
    }

    public static void Merge(int[] arr, int sI, int eI) {
        if (sI == eI) {
            return;
        }
        int mid = (sI + eI) / 2;
        Merge(arr, sI, mid);
        Merge(arr, mid + 1, eI);
        MergeSort(arr, sI, eI);
    }

    public static void main(String[] args) {
        int[] arr = readArray();
        Merge(arr, 0, arr.length - 1);
        PrintArray(arr);
    }
}
