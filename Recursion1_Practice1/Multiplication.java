package Codezen_Codes.Recursion1_Practice1;

import java.util.Scanner;

public class Multiplication {
    public static int Multiply(int a,int b){
        if(b==1){
            return a;
        }
        int sA=Multiply(a,b-1);
        int res=sA+a;
        return res;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int result=Multiply(a,b);
        System.out.print(result);
    }
}
