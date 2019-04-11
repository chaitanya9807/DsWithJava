package Codezen_Codes.Arrays2_Practice;

import java.util.Scanner;

public class RotateArray {
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
    public static void Rotate(int[] arr,int d){
        int[] arr1=new int[d];
        int j=d,i;
        for(i=0;j>0;j--,i++){
            arr1[i]=arr[i];
        }
        j=0;
        for(;j<arr.length-d;j++){
            arr[j]=arr[j+d];
        }
        i=0;
        for(j=(arr.length-d);j<arr.length;j++){
            arr[j]=arr1[i];
            i++;
        }
    }
    public static void main(String[] args){
        int[] arr=ReadArray();
        int d = s.nextInt();
        Rotate(arr,d);
        PrintArray(arr);
    }
}
