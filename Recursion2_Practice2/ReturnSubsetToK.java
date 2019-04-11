package Codezen_Codes.Recursion2_Practice2;

import java.util.Scanner;

public class ReturnSubsetToK {
    public static Scanner s = new Scanner(System.in);

    public static int[] readArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int[][] returnSubsets(int[] arr, int sum, int sI) {
        if (sI == arr.length) {
            if (sum == 0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }
        }

        int[][] temp1 = returnSubsets(arr, sum, sI + 1);
        int[][] temp2 = returnSubsets(arr, sum - arr[sI], sI + 1);
        int[][] totalsubsets = new int[temp1.length + temp2.length][];
        int i, k = 0,m=0;
        for (i = 0; i < temp2.length; i++) {
            totalsubsets[i] = new int[temp2[i].length+1];
            totalsubsets[k][0] = arr[sI];
            for (int a : temp2[i]) {
                totalsubsets[k][m+1] = a;
            }
            k++;
            m=0;
        }
        m=0;
        for (i = 0; i < temp1.length; i++) {
            totalsubsets[k] = new int[temp1[i].length];
            for (int a : temp1[i]) {
                totalsubsets[k][m++] = a;
            }
            k++;
            m=0;
        }
        return totalsubsets;
    }

    public static void main(String[] args) {
        int[] arr = readArray();
        int[][] arr1 = returnSubsets(arr, s.nextInt(), 0);
        for (int[] a : arr1) {
            for (int n : a) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
