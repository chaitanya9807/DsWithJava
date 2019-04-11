package Lecture9_Recursion1;

import java.util.Scanner;

public class SumOfDigits {
    public static Scanner s = new Scanner(System.in);

    public static int SumofDigits(int n){
        if(n==0){
            return 0;
        }
        int sA=SumofDigits(n/10);
        int res=sA+n%10;
        return res;
    }

    public static void main(String[] args){
        int n=s.nextInt();
        System.out.print(SumofDigits(n));
    }
}
