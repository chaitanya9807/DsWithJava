package Codezen_Codes.Recursion_1;

import java.util.Scanner;

public class Power {
    public static Scanner s = new Scanner(System.in);
    public static int pow(int x,int n){
        if(n==1){
            return x;
        }
        int sA=pow(x,n-1);
        int res=x*sA;
        return res;
    }
    public static void main(String[] args){
        int x=s.nextInt();
        int n=s.nextInt();
        System.out.print(pow(x,n));
    }
}
