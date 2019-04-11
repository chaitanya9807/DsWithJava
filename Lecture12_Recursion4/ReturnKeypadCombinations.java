package Lecture12_Recursion4;

import java.util.Scanner;

public class ReturnKeypadCombinations {
    public static Scanner s = new Scanner(System.in);

    public static String[] Keypad(int n) {
        if (n == 2) {
            String[] retval = {"a", "b", "c"};
            return retval;
        } else if (n == 3) {
            String[] retval = {"d", "e", "f"};
            return retval;
        } else if (n == 4) {
            String[] retval = {"g", "h", "i"};
            return retval;
        } else if (n == 5) {
            String[] retval = {"j", "k", "l"};
            return retval;
        } else if (n == 6) {
            String[] retval = {"m", "n", "o"};
            return retval;
        } else if (n == 7) {
            String[] retval = {"p", "q", "r", "s"};
            return retval;
        } else if (n == 8) {
            String[] retval = {"t", "u", "v"};
            return retval;
        } else if (n == 9) {
            String[] retval = {"w", "x", "y", "z"};
            return retval;
        } else return new String[]{""};
    }

    public static String[] ReturnKeypad(int n) {
        if (n == 0) {
            String[] base = {""};
            return base;
        }
        String[] CombinationsOfSmallerNumber = ReturnKeypad(n / 10);
        String[] CurrentNumberCombinations = Keypad(n % 10);
        String[] TotalCombinations = new String[CombinationsOfSmallerNumber.length * CurrentNumberCombinations.length];
        int k = 0;
        for (String str : CombinationsOfSmallerNumber) {
            for (String str1 : CurrentNumberCombinations) {
                TotalCombinations[k++] = str + str1;
            }
        }
        return TotalCombinations;
    }

    public static void main(String[] args) {
        for (String str1 : ReturnKeypad(s.nextInt())) {
            System.out.println(str1);
        }
    }
}
