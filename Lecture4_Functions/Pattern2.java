package Lecture4_Functions;

/*

 *
 **
 ***
 ****
 *****

 */

import java.util.Scanner;

public class Pattern2 {
    private static void PatternPrint2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int c = 1; c <= i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PatternPrint2(n);
    }
}