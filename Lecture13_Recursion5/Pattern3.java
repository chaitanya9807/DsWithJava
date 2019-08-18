package Lecture13_Recursion5;

import java.util.Scanner;

/*

    12345
    12345
    12345
    12345
    12345

 */
public class Pattern3 {
    public static Scanner s = new Scanner(System.in);
    public static void printpattern(int n,int r,int c){
        if(r<=0){
            return;
        }
        if(c>n){
            System.out.println();
            printpattern(n,r-1,1);
            return;
        }
        System.out.print(c);
        printpattern(n,r,c+1);
    }
    public static void main(String[] args){
        int n=s.nextInt();
        printpattern(n,n,1);

    }

}
