package Codezen_Codes.Arrays1_Lecture;

import java.util.Scanner;

public class ArraySum {
    public static Scanner s = new Scanner(System.in);

    public static int[] readArray(){
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int Sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr=readArray();
        int sum=Sum(arr);
        System.out.print(sum);
    }
}
