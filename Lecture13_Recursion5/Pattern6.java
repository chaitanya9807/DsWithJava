package Lecture13_Recursion5;

import java.util.Scanner;

public class Pattern6 {
    public static Scanner s = new Scanner(System.in);
    public static void printpattern(int n,int r,int c){
        if(r>n){
            return;
        }
        if(c>r){
            System.out.println();
            printpattern(n,r+1,1);
            return;
        }
        System.out.print(r);
        printpattern(n,r,c+1);
    }
    public static void main(String[] args){
        int n=s.nextInt();
        printpattern(n,1,1);
    }
}
