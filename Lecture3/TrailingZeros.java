package Codezen_Codes.Lecture3;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        int c=0;
        for(int i=5;n/i>=1;i*=5){
            c+=n/i;
        }
        System.out.print(c);
    }
}
