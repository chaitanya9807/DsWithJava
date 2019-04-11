package Codezen_Codes.Arrays2_Practice;

import java.util.Scanner;

public class PushZerosToEnd {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void PushZeroes(int[] arr){
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
    }


    public static void main(String[] args) {
        int[] arr = ReadArray();
        PushZeroes(arr);
        System.out.println();
        PrintArray(arr);
    }
}
