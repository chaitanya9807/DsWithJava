package Codezen_Codes.Assignment3;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int j= (int) Math.sqrt(n);
        System.out.print(j);
    }
}
