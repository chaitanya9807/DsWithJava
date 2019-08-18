package Lecture4_Functions;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static int findSum(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = findSum(a, b);
        System.out.print(sum);
    }
}