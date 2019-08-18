package Lecture9_Recursion1;

import java.util.Scanner;

public class PrintDecreasing {
    public static Scanner s = new Scanner(System.in);
    public static void PrintDec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
    public static void main(String[] args){
        int n=s.nextInt();
        PrintDec(n);
    }
}
