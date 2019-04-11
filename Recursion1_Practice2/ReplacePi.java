package Codezen_Codes.Recursion1_Practice2;

import java.util.Scanner;

public class ReplacePi {
    public static Scanner s = new Scanner(System.in);

    public static String removepi(String str) {
        if (str.length() == 0) {
            return "";
        }
        String str1="";
        if (str.length() > 1) {
            if (str.substring(0, 2).equals("pi")) {
                str1+="3.14";
                str1+=removepi(str.substring(2));
            } else {
                str1 += str.charAt(0);
                str1 += removepi(str.substring(1));
            }
        } else{
            return str;
        }
        return str1;
    }
    public static void main(String[] args) {
        System.out.print(removepi(s.nextLine()));
    }
}
