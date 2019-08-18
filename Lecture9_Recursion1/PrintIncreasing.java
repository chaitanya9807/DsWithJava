package Lecture9_Recursion1;

import java.util.Scanner;

public class PrintIncreasing {
    public static Scanner s = new Scanner(System.in);
    public static void PrintInc(int n){
        if(n==0){
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        int n=s.nextInt();
        PrintInc(n);
    }
}
