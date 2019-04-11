package Codezen_Codes.StringsAnd2DArrays;

import java.util.Scanner;

public class WavePrint {
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

    public static void PrintWave(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = TakeInput();
        PrintWave(arr);
    }
}
