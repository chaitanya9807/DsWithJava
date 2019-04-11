package Lecture7_2DArrays;

import java.util.Scanner;

public class PrintColumnWise {
    public static Scanner s = new Scanner(System.in);
    public  static int[][] TakeInput(){
        int row=s.nextInt();
        int col=s.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        return arr;
    }
    public static void PrintColumns(int[][] arr){
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] arr=TakeInput();
        PrintColumns(arr);
    }
}
