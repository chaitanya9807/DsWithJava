package Codezen_Codes.Arrays1_Lecture;

import java.util.Scanner;

public class DifferenceOfEvenAndOddIndicedElements {
    public static Scanner s = new Scanner(System.in);

    public static int [] readArray(){
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int FindDifference(int[] arr){
        int OddSum=0;
        int EvenSum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                EvenSum+=arr[i];
            }
            else{
                OddSum+=arr[i];
            }
        }
        int diff=EvenSum-OddSum;
        return diff;
    }
    public static void main(String[] args){
        int[] arr=readArray();
        int diff=FindDifference(arr);
        System.out.print(diff);
    }
}
