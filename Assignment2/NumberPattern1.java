package Codezen_Codes.Assignment2;

/*

    1
    11
    111
    1111

 */

import java.util.Scanner;

public class NumberPattern1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int count=1;
            while (count<=row){
                System.out.print("1");
                count++;
            }
            row++;
            System.out.println();
        }
    }
}
