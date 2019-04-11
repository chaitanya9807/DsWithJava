package Lecture11_Recursion3;

import java.util.Scanner;

public class AllSubsets {
    public static Scanner s = new Scanner(System.in);

    public static int[][] ReturnAllSubsets(int[] arr, int sI) {
        if (sI == arr.length) {
            int[][] base = new int[1][0];
            return base;
        }
        int[][] subsetofsmallerArray = ReturnAllSubsets(arr, sI + 1);
        int i = 0, k = 0;
        int[][] totalsubsets = new int[(subsetofsmallerArray.length) * 2][];
        for (; i < subsetofsmallerArray.length; i++) {
            totalsubsets[i] = new int[subsetofsmallerArray[i].length];
            for (int j = 0; j < subsetofsmallerArray[i].length; j++) {
                totalsubsets[i][j] = subsetofsmallerArray[i][j];
            }
        }
        for (; i < totalsubsets.length; i++, k++) {
            totalsubsets[i] = new int[subsetofsmallerArray[k].length + 1];
            totalsubsets[i][0] = arr[sI];
            for (int j = 0; j < subsetofsmallerArray[k].length; j++) {
                totalsubsets[i][j + 1] = subsetofsmallerArray[k][j];
            }
        }
        return totalsubsets;
    }

    public static void main(String[] args) {
        int m = s.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = s.nextInt();
        }
        int[][] result = ReturnAllSubsets(arr, 0);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}