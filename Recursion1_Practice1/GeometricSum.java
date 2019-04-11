package Codezen_Codes.Recursion1_Practice1;

import java.util.Scanner;

public class GeometricSum {
    public static double sum(int n){
        if(n==0){
            return 1;
        }
        double sA= sum(n-1);
        double res=(1/Math.pow(2.0,n))+sA;
        return res;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(sum(n));
    }
}
