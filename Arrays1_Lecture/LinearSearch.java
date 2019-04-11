package Codezen_Codes.Arrays1_Lecture;

import java.util.Scanner;

public class LinearSearch {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray(){
        int n = s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int LinearSearch(int[] arr,int num){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr=ReadArray();
        System.out.print(LinearSearch(arr,s.nextInt()));
    }
}
