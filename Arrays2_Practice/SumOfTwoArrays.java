package Codezen_Codes.Arrays2_Practice;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int[] Sum(int[] arr1, int[] arr2) {
        int n = 0;
        if (arr1.length >= arr2.length) {
            n = arr1.length + 1;
        } else {
            n = arr2.length + 1;
        }
        int[] arr = new int[n];
        n--;
        int i, j = 0;
        for (i = arr1.length - 1, j = arr2.length - 1; i >= 0 && j >= 0; i--, j--) {
            if (n >= 1) {
                arr[n] += arr1[i] + arr2[j];
                if (arr[n] > 9) {
                    arr[n - 1] += arr[n] / 10;
                    arr[n] = arr[n] % 10;
                }
                n--;
            }
        }
        if (i >= 0) {
            while (i >= 0) {
                arr[n] += arr1[i];
                if (arr[n] > 9) {
                    arr[n - 1] += arr[n] / 10;
                    arr[n] = arr[n] % 10;
                }
                i--;
                n--;
            }
        } else if (j >= 0) {

            while (j >= 0) {
                arr[n] += arr2[j];
                if (arr[n] > 9) {
                    arr[n - 1] += arr[n] / 10;
                    arr[n] = arr[n] % 10;
                }
                j--;
                n--;
            }
        }
        return arr;
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = ReadArray();
        int[] arr2 = ReadArray();
        int[] SumArray = Sum(arr1, arr2);
        PrintArray(SumArray);
    }
}
