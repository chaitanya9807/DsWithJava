package Lecture13_Recursion5;

import java.util.Scanner;
/*

    1
    23
    345
    4567

 */

public class Pattern7 {
    public static Scanner s = new Scanner(System.in);
    public static void printpattern(int n,int r,int c,int val){
        if(r>n){
            return;
        }
        if(c>r){
            System.out.println();
            printpattern(n,r+1,1,r+1);
            return;
        }
        System.out.print("*");
        printpattern(n,r,c+1,val+1);
    }
    public static void main(String[] args){
        int n=s.nextInt();
        printpattern(n,1,1,1);
    }
}
