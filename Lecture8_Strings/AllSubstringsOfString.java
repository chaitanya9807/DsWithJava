package Lecture8_Strings;

import java.util.Scanner;

public class AllSubstringsOfString {

    public static Scanner s = new Scanner(System.in);

    public static void PrintSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = s.nextLine();
        PrintSubstrings(str);
    }
}
