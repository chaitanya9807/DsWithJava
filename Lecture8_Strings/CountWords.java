package Lecture8_Strings;

import java.util.Scanner;

public class CountWords {
    public static Scanner s = new Scanner(System.in);

    public static int Words(String str) {
        int c = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(" ")) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String str = s.nextLine();
        System.out.print(Words(str));
    }
}
