package Lecture8_Strings;

import java.util.Scanner;

public class ReplaceCharacter {
    public static Scanner s = new Scanner(System.in);

    public static String Replace(String str, char a, char x) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                str1 += x;
            } else {
                str1 += str.charAt(i);
            }
        }
        return str1;
    }

    //    + here acts as a concatenation operator.
//     After each concatenation, a new String is formed and str1 points to the new string formed
//     at the end, str1 points to the last concatenated string.
//     This is not a good approach because lots of memory is used after each concatenation,
//     but this is the only approach because strings are immutable.
    public static void main(String[] args) {
        String str = s.nextLine();
        char a = s.next().charAt(0);
        char x = s.next().charAt(0);
        System.out.print(Replace(str, a, x));
    }
}
