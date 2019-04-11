package Codezen_Codes.Arrays1_Lecture;

import java.util.Scanner;

public class SwapAlternate {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void SwapAlternative(int[] arr) {
        int temp = 0;
        int length = arr.length;
        for (int i = 0; i < length - 1; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = ReadArray();
        SwapAlternative(arr);
        PrintArray(arr);

    }
}
