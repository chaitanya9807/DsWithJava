package Lecture9_Recursion1;

import java.util.Scanner;

public class SumOfArray {
    public static Scanner s = new Scanner(System.in);
    public static int sum(int[] arr,int sI){
        if(sI==arr.length){
            return 0;
        }
        int sA=sum(arr,sI+1);
        int res=arr[sI]+sA;
        return res;
    }
    public static void main(String[] args){
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print(sum(arr,0));
    }
}
