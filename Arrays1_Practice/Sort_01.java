package Codezen_Codes.Arrays1_Practice;

import java.util.Scanner;

public class Sort_01 {
    public static Scanner s = new Scanner(System.in);
    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void SortBinaryArray(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==1){
//                for(int j=i+1;j<arr.length;j++){
//                    if(arr[j]==0){
//                        int temp=arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=temp;
//                    }
//                }
//            }
//        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=1;
        }
    }
    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr=ReadArray();
        SortBinaryArray(arr);
        PrintArray(arr);
    }
}
