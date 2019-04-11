package Lecture2_Patterns;

/*

    1
    12
    123
    1234
    12345

 */

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int count=1;
            while(count<=row){
                System.out.print(count);
                count++;
            }
            row++;
            System.out.println();
        }
    }
}
