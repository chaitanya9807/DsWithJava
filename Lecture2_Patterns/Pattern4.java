package Lecture2_Patterns;

/*

    1
    22
    333
    4444
    55555

 */

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int count=1;
            while(count<=row){
                System.out.print(row);
                count++;
            }
            row++;
            System.out.println();
        }
    }
}
