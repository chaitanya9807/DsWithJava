package Codezen_Codes.Recursion1_Practice2;

import java.util.Scanner;

public class PairStar {
    public static Scanner s = new Scanner(System.in);

    public static String pairStar(String str) {
        if (str.length() == 0) {
            return "";
        }
        String str1 = "";
        if (str.length() > 1) {
            if (str.charAt(0) == str.charAt(1)) {
                str1 += str.charAt(0) + "*" + str.charAt(1);
                str1 += pairStar(str.substring(1));
            } else {
                str1 += str.charAt(0);
                str1 += pairStar(str.substring(1));
            }
        } else {
            str1 += str.charAt(0);
            str1 += pairStar(str.substring(1));
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.print(pairStar(s.nextLine()));
    }
}