package Codezen_Codes.Recursion1_Practice2;

import java.util.Scanner;

public class RemoveX {
    public static Scanner s = new Scanner(System.in);

    public static String removeX(String str) {
        if (str.length() == 0) {
            return "";
        }
        String str1="";
        if (str.charAt(0) == 'x' || str.charAt(0) == 'X') {
            str1 += removeX(str.substring(1));
        } else {
            str1 += str.charAt(0);
            str1 += removeX(str.substring(1));
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.print(removeX(s.nextLine()));
    }
}
