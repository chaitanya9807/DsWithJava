package Codezen_Codes.StringsAnd2DArrays;

import java.util.Scanner;

public class SumOfRows {
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
//    public static void PrintArray(int[][] arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
    public static void SumOfRow(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args){
        int[][] arr=TakeInput();
        SumOfRow(arr);
    }
}
