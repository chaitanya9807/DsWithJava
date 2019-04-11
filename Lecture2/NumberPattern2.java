package Codezen_Codes.Lecture2;
/*

        1
       23
      345
     4567

 */

import java.util.Scanner;

public class NumberPattern2 {
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
            int a=row;
            while(c<=row){
                System.out.print(a);
                a++;
                c++;
            }
            row++;
            System.out.println();
        }
    }
}
