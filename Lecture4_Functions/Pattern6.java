package Lecture4_Functions;
/*

     *
    **
   ***
  ****
 *****

 */

import java.util.Scanner;

public class Pattern6 {
    public static void Patternprint6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Patternprint6(n);
    }
}
