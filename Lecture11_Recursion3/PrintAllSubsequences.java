package Lecture11_Recursion3;

import java.util.Scanner;

public class PrintAllSubsequences {
    public static Scanner s = new Scanner(System.in);

    public static void PrintAllSubsequence(String str, String PreservedChars) {
        if (str.length() == 0) {
            System.out.println(PreservedChars);
            return;
        }
        PrintAllSubsequence(str.substring(1), PreservedChars);
        PrintAllSubsequence(str.substring(1), PreservedChars + str.charAt(0));
    }

    public static void main(String[] args) {
        String str = s.nextLine();
        PrintAllSubsequence(str, "");
    }
}
