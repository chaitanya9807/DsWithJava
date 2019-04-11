package Codezen_Codes.Arrays2_Practice;

import java.util.Scanner;

public class SecondLargest {
    public static Scanner s = new Scanner(System.in);
    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static int SecondLarge(int[] arr){
        int max=arr[0];
        int pos=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                pos=i;
            }
        }
        int x=max;
        for(int i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                pos=i;
                for(int j=pos;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                n--;
            }
        }
        if(n>=0) {
            max = arr[0];
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
//            if (max == x) {
//                for (int j = pos; j < arr.length - 2; j++) {
//                    arr[j] = arr[j + 1];
//                }
//            }
        }
        else{
            return -2147483648;
        }

        return max;
    }
    public static void main(String[] args){
        int[] arr=ReadArray();
        System.out.println(SecondLarge(arr));
    }
}
