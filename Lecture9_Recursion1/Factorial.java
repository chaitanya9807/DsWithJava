package Lecture9_Recursion1;

import java.util.Scanner;

public class Factorial {
    public static Scanner s = new Scanner(System.in);
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int SmallAns=fact(n-1);
        int res=n*SmallAns;
        return res;
    }
    public static void main(String[] args){
        int n=s.nextInt();
        System.out.print(fact(n));
    }
}
