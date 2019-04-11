package Codezen_Codes.Recursion2_Practice1;

import java.util.Scanner;

public class CheckAB {
    public static Scanner s = new Scanner(System.in);

    public static boolean checkAB(String str) {
        if(str.length()==0){
            return true;
        }
        if (str.charAt(0) == 'a') {
            if (str.length() > 1 && str.charAt(1) == 'a') {
                return checkAB(str.substring(1));
            } else if (str.length() > 2 && str.charAt(1) == 'b' && str.charAt(2) == 'b') {
                return checkAB(str.substring(3));
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(checkAB(s.nextLine()));
    }
}
