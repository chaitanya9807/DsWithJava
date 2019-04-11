package Codezen_Codes.Assignment3;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long r = 0;
        long c = 0;
        while (n != 0) {
            long t = n % 2;
            r =r + t * (long)Math.pow(10, c);
            n = n / 2;
            c++;
        }
        System.out.print(r);
    }
}