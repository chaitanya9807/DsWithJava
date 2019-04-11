package Codezen_Codes.Assignment2;
/*

    1234
    123
    12
    1

 */

import java.util.Scanner;

public class NumberPattern4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        while(n>=1){
            int i=1;
            while(i<=n){
                System.out.print(i);
                i++;
            }
            n--;
            System.out.println();
        }
    }
}
