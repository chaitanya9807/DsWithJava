package Codezen_Codes.StringsAnd2DArrays;

import java.util.Scanner;

public class MaximumRow_Column {
    public static Scanner s = new Scanner(System.in);

    public static int[][] TakeInput() {
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static void MaxSum(int[][] arr) {
        int RowSum = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxColumn = -1;
        int ColSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > RowSum) {
                RowSum = sum;
                maxRow = i;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            if (sum > ColSum) {
                ColSum = sum;
                maxColumn = j;
            }
        }
        if (RowSum >= ColSum) {
            System.out.print("row " + maxRow + " " + RowSum);
        } else {
            System.out.print("column " + maxColumn + " " + ColSum);
        }
    }

    public static void main(String[] args) {
        int[][] arr = TakeInput();
        MaxSum(arr);
    }
}
