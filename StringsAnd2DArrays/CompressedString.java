package Codezen_Codes.StringsAnd2DArrays;

import java.util.Scanner;

public class CompressedString {
    public static Scanner s = new Scanner(System.in);

    public static String compress(String str) {
        String str1 = "";
        int count = 1;
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            j = i + 1;
            while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                count++;
                j++;
            }
            str1 += str.charAt(i);
            if (count > 1) {
                str1 += count;
            }
            i += count - 1;
        }
        return str1;
    }

    public static void main(String[] args) {
        String str = s.nextLine();
        System.out.print(compress(str));
    }
}
