package Lecture2_Patterns;

/*

         *
        **
       ***
      ****
     *****

 */

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {
            int space = 1;
            while (space <= (n - row)) {
                System.out.print(" ");
                space++;
            }
            int count = 1;
            while (count <= row) {
                System.out.print("*");
                count++;
            }
            row++;
            System.out.println();


        }
    }
}
