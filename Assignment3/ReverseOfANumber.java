package Codezen_Codes.Assignment3;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int r=0;
        while(n>0){
            int t=n%10;
            r=r*10+t;
            n=n/10;
        }
        System.out.print(r);
    }
}
