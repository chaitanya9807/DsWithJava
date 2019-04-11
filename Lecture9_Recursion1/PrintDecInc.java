package Lecture9_Recursion1;

import java.util.Scanner;

public class PrintDecInc {
    public static Scanner s = new Scanner(System.in);
    public static void printDecInc(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printDecInc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args){
        int n=s.nextInt();
        printDecInc(n);
    }
}
