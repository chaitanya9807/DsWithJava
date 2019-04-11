package Codezen_Codes.Lecture2;

/*

       *
      ***
     *****
    *******

 */

import java.util.Scanner;

public class StarPattern {
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
            while(c<=(2*row)-1){
                System.out.print("*");
                c++;
            }
            row++;
            System.out.println();
        }
    }
}
