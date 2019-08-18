package Lecture17_StacksAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void Reverse(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.isEmpty()) {
            return;
        }
        int element = s1.pop();
        Reverse(s1, s2);
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(element);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Stack<Integer> input = new Stack<Integer>();
        for (int i = 0; i < size; i++) {
            input.push(s.nextInt());
        }
        Stack<Integer> extra = new Stack<Integer>();
        Reverse(input, extra);
        while (!input.isEmpty()) {
            System.out.print(input.pop() + " ");
        }

    }
}