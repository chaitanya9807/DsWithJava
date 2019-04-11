package Lecture6_Arrays2;

import java.util.Scanner;

public class MergeSort {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray() {
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

    public static int[] MergeSort(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int k = 0, i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = ReadArray();
        int[] arr2 = ReadArray();
        int[] arr = MergeSort(arr1, arr2);
        PrintArray(arr);
    }
}
