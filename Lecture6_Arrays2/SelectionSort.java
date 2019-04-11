package Lecture6_Arrays2;

import java.util.Scanner;

public class SelectionSort {
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

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i], pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            if (i != pos) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
             }
        }
    }

    public static void main(String[] args) {
        int[] arr = ReadArray();
        SelectionSort(arr);
        PrintArray(arr);
    }
}
