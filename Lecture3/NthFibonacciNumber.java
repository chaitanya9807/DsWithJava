package Codezen_Codes.Lecture3;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args){
        int a=0,b=1;
        int c=0;
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print(b);
    }
}
