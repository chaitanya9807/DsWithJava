package Codezen_Codes.StacksAndQueuesPractice;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBrackets {
    public static Boolean checkRedundant(String str) {
        int j=0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                if (str.charAt(i + 1) == '(') {
                    return true;
                } else {
                    stack.push(str.charAt(i));
                    j++;
                }
            } else if (str.charAt(i) != ')') {
                stack.push(str.charAt(i));
                j++;
            } else {
                if (!stack.isEmpty() && stack.peek() == '(' ) {
                    return true;
                } else {
                    if(j==str.length()-1){
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(checkRedundant(s.nextLine()));
    }
}
