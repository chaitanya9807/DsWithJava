package Lecture4_Functions;

import java.util.Scanner;

public class FactorialFunction {
    public static int FindFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact = FindFact(n);
        System.out.println(fact);
    }
}