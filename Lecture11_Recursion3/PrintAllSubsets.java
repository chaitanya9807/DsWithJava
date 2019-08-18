package Lecture11_Recursion3;

import java.util.Scanner;

public class PrintAllSubsets {
    public static Scanner s = new Scanner(System.in);

    public static void PrintAllSubsets(int[] arr, int sI, int[] arraySoFar) {
        if (sI == arr.length) {
            for (int val : arraySoFar) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        PrintAllSubsets(arr, sI + 1, arraySoFar);
        int[] arr1 = new int[arraySoFar.length + 1];
        int i = 0;
        for (; i < arraySoFar.length; i++) {
            arr1[i] = arraySoFar[i];
        }
        arr1[i] = arr[sI];
        PrintAllSubsets(arr, sI + 1, arr1);
    }

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        PrintAllSubsets(arr, 0, new int[0]);
    }
}
