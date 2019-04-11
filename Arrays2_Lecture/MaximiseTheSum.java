package Codezen_Codes.Arrays2_Lecture;

import java.util.Scanner;

public class MaximiseTheSum {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static long MaximumSumPath(int[] arr1, int[] arr2) {
        long sum1=0,sum2=0,maxsum=0;
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                sum1 = sum1+arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                sum2=sum2+arr2[j];
                j++;
            }
            else{
                if(sum1>sum2){
                    maxsum=maxsum+sum1+arr1[i];
                }
                else{
                    maxsum=maxsum+sum2+arr2[j];
                }
                i++;
                j++;
                sum1=0;sum2=0;
            }
        }
        while(i<arr1.length){
            sum1=sum1+arr1[i];
            i++;
        }
        while(j<arr2.length){
            sum2+=arr2[j];
            j++;
        }
        if(sum1>sum2)
            maxsum+=sum1;
        else
            maxsum+=sum2;
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr1 = ReadArray();
        int[] arr2 = ReadArray();
        System.out.print(MaximumSumPath(arr1, arr2));
    }
}
