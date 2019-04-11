package Codezen_Codes.Lecture3;

/*

     *
      * *
       * * *
        * * * *
       * * *
      * *
     *

 */

import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int m=(n/2)+1;
        int p=n-m;
        for(int i=1;i<=m;i++){
            for(int sp=1;sp<i;sp++){
                System.out.print(" ");
            }
            for(int c=1;c<=i;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=p;i>=1;i--){
            for(int sp=1;sp<i;sp++){
                System.out.print(" ");
            }
            for(int c=i;c>=1;c--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
