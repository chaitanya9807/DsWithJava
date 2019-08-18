package Lecture7_2DArrays;

import java.util.Scanner;

public class SpiralPrinting {
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

    public static void Spiral(int[][] arr) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = arr.length - 1;
        int colEnd = arr[0].length - 1;
        int c = 1;
        int n = arr.length * arr[0].length;
        while (c <= n) {
            for (int j = colStart; c <= n && j <= colEnd; j++) {
                System.out.print(arr[rowStart][j] + " ");
                c++;
            }
            rowStart++;
            for (int i = rowStart; c <= n && i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
                c++;
            }
            colEnd--;
            for (int j = colEnd; c <= n && j >= colStart; j--) {
                System.out.print(arr[rowEnd][j] + " ");
                c++;
            }
            rowEnd--;
            for (int i = rowEnd; c <= n && i >= rowStart; i--) {
                System.out.print(arr[i][colStart] + " ");
                c++;
            }
            colStart++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = TakeInput();
        Spiral(arr);
    }
}