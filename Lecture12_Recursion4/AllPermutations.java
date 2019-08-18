package Lecture12_Recursion4;

import java.util.Scanner;

public class AllPermutations {
    public static Scanner s = new Scanner(System.in);

    public static String[] ReturnAllPermutations(String str) {
        if (str.length() == 0) {
            String[] base = {""};
            return base;
        }
        String[] PermOfSmallString = ReturnAllPermutations(str.substring(1));
        String[] TotalPermutations = new String[PermOfSmallString.length * str.length()];
        int k = 0;
        for (String perm : PermOfSmallString) {
            for (int i = 0; i <= perm.length(); i++) {
                String Str1 = perm.substring(0, i) + str.charAt(0) + perm.substring(i);
                TotalPermutations[k] = Str1;
                k++;
            }
        }
        return TotalPermutations;
    }

    public static void main(String[] args) {
        String[] str = ReturnAllPermutations(s.nextLine());
        for (String str1 : str) {
            System.out.println(str1);
        }
    }
}
