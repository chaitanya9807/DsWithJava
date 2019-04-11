package Codezen_Codes.Assignment3;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n=s.nextLong();
        int c=0;
        int r=0;
        while(n!=0){
            long t=n%10;
            r= (int) (r+(Math.pow(2,c)*t));
            n=n/10;
            c++;
        }
        System.out.print(r);
    }
}
