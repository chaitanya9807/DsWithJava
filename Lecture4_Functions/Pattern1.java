package Lecture4_Functions;

/*
     *****
     *****
     *****
     *****
     *****
 */

import java.util.Scanner;

public class Pattern1 {
    public static void PatternPrint1(int n){
        for(int i=1;i<=n;i++){
            for(int c=1;c<=n;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        PatternPrint1(n);
    }
}
