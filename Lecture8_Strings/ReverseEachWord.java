package Lecture8_Strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static Scanner s = new Scanner(System.in);

    public static String reverse(String str) {
        int pos = 0;
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                for (int j = i - 1; j >= pos; j--) {
                    str1 += str.charAt(j);
                }
                str1 += ' ';
                pos = i + 1;
            } else if (i == str.length() - 1) {
                for (int j = i; j >= pos; j--) {
                    str1 += str.charAt(j);
                }
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        String str = s.nextLine();
        System.out.print(reverse(str));
    }
}