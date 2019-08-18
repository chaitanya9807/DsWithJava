package Lecture13_Recursion5;

import java.util.Scanner;

public class PatternStar {
    public static Scanner s = new Scanner(System.in);
    public static void PrintPattern(int n,int r,int c){
        if(r<=0){
            return;
        }
        if(c<=0){
            System.out.println();
            PrintPattern(n,r-1,n);
            return;
        }
        System.out.print("*");
        PrintPattern(n,r,c-1);
    }
    public static void main(String[] args){
//        PrintPattern(s.nextInt());
        int n=s.nextInt();
        PrintPattern(n,n,n);
    }
}
