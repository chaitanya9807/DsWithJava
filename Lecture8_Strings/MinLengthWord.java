package Lecture8_Strings;

import java.util.Scanner;

public class MinLengthWord {
    public static Scanner s = new Scanner(System.in);

    public static String MinLength(String str) {
        int Endpos = 0;
        int minlength = Integer.MAX_VALUE;
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
            if (str.charAt(i) == ' ') {
                length--;
                if (length < minlength) {
                    minlength = length;
                    Endpos = i;
                }
                length = 0;
            } else if (i == str.length() - 1) {
                if (length < minlength) {
                    minlength = length;
                    Endpos = i + 1;
                }
            }
        }
        return str.substring(Endpos - minlength, Endpos);
    }

    public static void main(String[] args) {
        String str = s.nextLine();
        System.out.print(MinLength(str));
    }
}
