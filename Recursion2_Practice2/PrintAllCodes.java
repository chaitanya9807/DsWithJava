package Codezen_Codes.Recursion2_Practice2;

import java.util.Scanner;

public class PrintAllCodes {
    public static Scanner s = new Scanner(System.in);

    public static char returnvalue(int n) {
        if (n == 1) {
            return 'a';
        }
        if (n == 2) {
            return 'b';
        }
        if (n == 3) {
            return 'c';
        }
        if (n == 4) {
            return 'd';
        }
        if (n == 5) {
            return 'e';
        }
        if (n == 6) {
            return 'f';
        }
        if (n == 7) {
            return 'g';
        }
        if (n == 8) {
            return 'h';
        }
        if (n == 9) {
            return 'i';
        }
        if (n == 10) {
            return 'j';
        }
        if (n == 11) {
            return 'k';
        }
        if (n == 12) {
            return 'l';
        }
        if (n == 13) {
            return 'm';
        }
        if (n == 14) {
            return 'n';
        }
        if (n == 15) {
            return 'o';
        }
        if (n == 16) {
            return 'p';
        }
        if (n == 17) {
            return 'q';
        }
        if (n == 18) {
            return 'r';
        }
        if (n == 19) {
            return 's';
        }
        if (n == 20) {
            return 't';
        }
        if (n == 21) {
            return 'u';
        }
        if (n == 22) {
            return 'v';
        }
        if (n == 23) {
            return 'w';
        }
        if (n == 24) {
            return 'x';
        }
        if (n == 25) {
            return 'y';
        }
        if (n == 26) {
            return 'z';
        } else {
            return ' ';
        }
    }

    public static void PrintCodes(String str, String outputSoFar) {
        if (str.length() == 0) {
            System.out.println(outputSoFar);
            return;
        } else if (str.length() == 1) {
            outputSoFar += returnvalue(str.charAt(0) - '0');
            System.out.println(outputSoFar);
            return;
        }
        int a = str.charAt(0) - '0';
        int b = str.charAt(1) - '0';
        int k = a * 10 + b;
        PrintCodes(str.substring(1), outputSoFar + returnvalue(a));
        if (k <= 26) {
            PrintCodes(str.substring(2), outputSoFar + returnvalue(k));
        }
    }

    public static void main(String[] args) {
        PrintCodes(s.nextLine(), "");
    }
}