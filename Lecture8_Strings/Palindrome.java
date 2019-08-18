package Lecture8_Strings;

import java.util.Scanner;

public class Palindrome {
    public static Scanner s = new Scanner(System.in);

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = s.nextLine();
        System.out.print(isPalindrome(str));
    }
}
