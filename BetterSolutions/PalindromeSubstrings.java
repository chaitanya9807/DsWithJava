package Codezen_Codes.BetterSolutions;

import java.util.Scanner;

public class PalindromeSubstrings {
    public static Boolean palindrome(String str){
        for(int i=0,j=str.length()-1;i<=j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static int countpalindrome(String str) {
        if (str.length() == 1) {
            return 1;
        }
        int count = 1;
        for (int i = 2; i <= str.length(); i++) {
            String st = str.substring(0, i);
            if(palindrome(st)){
                count++;
            }
        }
        count += countpalindrome(str.substring(1));
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(countpalindrome(s.nextLine()));
    }
}