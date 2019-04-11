package Codezen_Codes.Arrays1_Lecture;

import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] Arrange(int n){
        int[] arr=new int[n];
        for(int c=1,i=0,j=-1;i<=j;c++){
            if(c%2!=0){
                arr[i]=c;
                i++;
            }
            else{
                arr[j]=c;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=Arrange(n);
        PrintArray(arr);
    }
}
