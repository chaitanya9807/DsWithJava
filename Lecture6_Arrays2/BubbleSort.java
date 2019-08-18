package Lecture6_Arrays2;

import java.util.Scanner;

public class BubbleSort {
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

    private static void BubbleSort(int[] arr) {
        for (int r = 0; r < arr.length - 1; r++) { // loop for (n - 1) elements
            for (int i = 0; i < arr.length - r - 1; i++) { // loop to place largest element at the end of unsorted part
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = ReadArray();
        BubbleSort(arr);
        PrintArray(arr);
    }
}