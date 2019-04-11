package Lecture13_Recursion5;

import java.util.Scanner;

public class PrintSubsetSumToK {
    public static Scanner s = new Scanner(System.in);
    public static int[] readArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void PrintSubsets(int[] arr,int sI,int sum,int[] outputSoFar){
        if(sI==arr.length){
            if(sum==0){
                for(int a:outputSoFar){
                    System.out.print(a);
                }
                System.out.println();
            }
            return;
        }
        int k=0;
        int[] arr1=new int[outputSoFar.length+1];
        for(int a:outputSoFar){
            arr1[k++]=a;
        }
        arr1[k]=arr[sI];
        sI++;
        PrintSubsets(arr,sI,sum,outputSoFar);
        PrintSubsets(arr,sI,sum-arr1[k],arr1);
    }
    public static void main(String[] args){
        int[] arr=readArray();
        PrintSubsets(arr,0,s.nextInt(), new int[0]);
    }
}
