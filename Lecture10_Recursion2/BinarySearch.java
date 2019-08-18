package Lecture10_Recursion2;

import java.util.Scanner;

public class BinarySearch {
    public static Scanner s = new Scanner(System.in);

    public static int Binary(int[] arr, int element, int sI, int eI) {
        if (sI > eI) {
            return -1;
        }
        int mid = (sI + eI) / 2;
        if (arr[mid] == element) {
            return mid;
        } else if (element < arr[mid]) {
            return Binary(arr, element, sI, mid - 1);
        } else {
            return Binary(arr, element, mid + 1, eI);
        }
    }

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int element = s.nextInt();
        System.out.print(Binary(arr, element, 0, arr.length));
    }
}