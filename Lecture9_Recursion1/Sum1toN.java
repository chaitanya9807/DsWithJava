package Lecture9_Recursion1;

import java.util.Scanner;

public class Sum1toN {
    public static Scanner s = new Scanner(System.in);

    public static int Sum(int n) {
        if (n == 0) {
            return 0;
        }
        int sA = Sum(n - 1);
        int res = sA + n;
        return res;
    }

    public static void main(String[] args) {
        int n = s.nextInt();
        System.out.print(Sum(n));
    }
}