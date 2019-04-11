package Lecture6_Arrays2;

import java.util.Scanner;

public class BubbleSort {
    public static Scanner s = new Scanner(System.in);
    public static int[] ReadArray(){
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void BubbleSort(int[] arr){
        for(int r=1;r<arr.length;r++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr=ReadArray();
        BubbleSort(arr);
        PrintArray(arr);
    }
}
