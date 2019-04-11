package Codezen_Codes.Recursion2_Practice1;

import java.util.Scanner;

public class Staircase {
    public static Scanner s = new Scanner(System.in);

    public static int Stairs(int n) {
        if (n == 1) {
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else if(n==3){
            return 4;
        }
        else if (n <= 0) {
            return 0;
        }
        int sum = 0;
        sum += Stairs(n - 1);
        sum += Stairs(n - 2);
        sum += Stairs(n - 3);
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(Stairs(s.nextInt()));
    }
}