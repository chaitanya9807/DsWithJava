package Lecture12_Recursion4;

import java.util.Scanner;

public class PrintAllPermutations {
    public static Scanner s = new Scanner(System.in);

    public static void PrintPermutations(String str, String OutputSoFar) {
        if (str.length() == 0) {
            System.out.println(OutputSoFar);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            PrintPermutations(str.substring(0, i) + str.substring(i + 1), OutputSoFar + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        PrintPermutations(s.nextLine(), "");
    }
}
