package Codezen_Codes.Lecture2;

/*

      1
     232
    34543
   4567654

 */

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        while(row<=n){
            int sp=1;
            while(sp<=(n-row)){
                System.out.print(" ");
                sp++;
            }
            int c=1;
            int i=row;
            while(c<=row){
                System.out.print(i);
                i++;
                c++;
            }
            i=i-2;
            while(i>=row){
                System.out.print(i);
                i--;
            }
            row++;
            System.out.println();
        }
    }
}
