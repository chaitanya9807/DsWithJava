package Lecture2_Patterns;

import java.util.Scanner;

/*

    1
    11
    111
    1111
    11111

 */

public class Pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int count=1;
            while(count<=row){
                System.out.print("1");
                count++;
            }
            row++;
            System.out.println();
        }
    }
}
