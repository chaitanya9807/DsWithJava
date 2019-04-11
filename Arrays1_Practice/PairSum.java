package Codezen_Codes.Arrays1_Practice;

import java.util.Scanner;

public class PairSum {
    public static Scanner s = new Scanner(System.in);
    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void FindPairs(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==n-arr[i]){
                    if(arr[j]>arr[i]){
                        System.out.println(arr[i]+" "+arr[j]);
                    }
                    else{
                        System.out.println(arr[j]+" "+arr[i]);
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr=ReadArray();
        int n=s.nextInt();
        FindPairs(arr,n);
    }
}
