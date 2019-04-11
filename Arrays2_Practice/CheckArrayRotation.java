package Codezen_Codes.Arrays2_Practice;

import java.util.Scanner;

public class CheckArrayRotation {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int CheckRotation(int[] arr) {
        int pos = -1;
        int r = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                pos = i;
                break;
            }
        }
        r=pos+1;
        return r;
    }

    public static void main(String[] args) {
        int[] arr = ReadArray();
        System.out.print(CheckRotation(arr));
    }
}
