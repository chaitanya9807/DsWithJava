package Codezen_Codes.Recursion2_Practice2;

import java.util.Scanner;

public class ReturnAllCodes {
    public static Scanner s = new Scanner(System.in);

    public static char returnvalue(int n) {
        if (n == 1) {
            return 'a';
        }
        if (n == 2) {
            return 'b';
        }
        if (n == 3) {
            return 'c';
        }
        if (n == 4) {
            return 'd';
        }
        if (n == 5) {
            return 'e';
        }
        if (n == 6) {
            return 'f';
        }
        if (n == 7) {
            return 'g';
        }
        if (n == 8) {
            return 'h';
        }
        if (n == 9) {
            return 'i';
        }
        if (n == 10) {
            return 'j';
        }
        if (n == 11) {
            return 'k';
        }
        if (n == 12) {
            return 'l';
        }
        if (n == 13) {
            return 'm';
        }
        if (n == 14) {
            return 'n';
        }
        if (n == 15) {
            return 'o';
        }
        if (n == 16) {
            return 'p';
        }
        if (n == 17) {
            return 'q';
        }
        if (n == 18) {
            return 'r';
        }
        if (n == 19) {
            return 's';
        }
        if (n == 20) {
            return 't';
        }
        if (n == 21) {
            return 'u';
        }
        if (n == 22) {
            return 'v';
        }
        if (n == 23) {
            return 'w';
        }
        if (n == 24) {
            return 'x';
        }
        if (n == 25) {
            return 'y';
        }
        if (n == 26) {
            return 'z';
        } else {
            return ' ';
        }
    }

    public static String[] returnCodes(String str) {
        if (str.length() == 0) {
            return new String[]{""};
        } else if (str.length() == 1) {
            char c = returnvalue(str.charAt(0) - '0');
            return new String[]{String.valueOf(c)};
        }
        String[] temp1 = returnCodes(str.substring(1));
        int a = str.charAt(0) - '0';
        int b = str.charAt(1) - '0';
        String[] temp2 = returnCodes(str.substring(2));
        int k = 0;
        if (a * 10 + b <= 26) {
            String[] totalcodes = new String[temp1.length + temp2.length];
            char c = returnvalue(a);
            for (String st : temp1) {
                totalcodes[k++] = c + st;
            }
            c = returnvalue(a * 10 + b);
            for (String st : temp2) {
                totalcodes[k++] = c + st;
            }
            return totalcodes;
        } else {
            String[] totalcodes = new String[temp1.length];
            for (String st : temp1) {
                char c = returnvalue(a);
                totalcodes[k++] = c + st;
            }
            return totalcodes;
        }
    }

    public static void main(String[] args) {
        String[] str = returnCodes(s.nextLine());
        for (String st : str) {
            System.out.println(st);
        }
    }
}
