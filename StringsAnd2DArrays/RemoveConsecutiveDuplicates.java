package Codezen_Codes.StringsAnd2DArrays;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static Scanner s = new Scanner(System.in);

    public static String RemoveDuplicates(String str) {
        String str1 = "";
        int count = 1;
        char RefChar;
        for (int i = 0; i < str.length();) {
            RefChar = str.charAt(i);
            str1 += RefChar;
            count=1;
            for (int j = i + 1; j < str.length(); j++) {
                if (RefChar == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > 1) {
                i += count;
            }
            else{
                i++;
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        String str = s.nextLine();
        System.out.print(RemoveDuplicates(str));
    }
}
