package Lecture4_Functions;

import java.util.Scanner;

/*
    1
    22
    333
    4444
    55555
 */

public class Pattern4 {
    public static void PatternPrint4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int c = 1; c <= i; c++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PatternPrint4(n);
    }
}