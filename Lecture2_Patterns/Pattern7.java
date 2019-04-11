package Lecture2_Patterns;

/*

        1
       11
      111
     1111
    11111

 */

import java.util.Scanner;

public class Pattern7 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int row=1;
            int n=sc.nextInt();
            while(row<=n){
                int space=1;
                while(space<=(n-row)){
                    System.out.print(" ");
                    space++;
                }
                int count=1;
                while(count<=row){
                    System.out.print("1");
                    count++;
                }
                System.out.println();
                row++;
            }
        }
}
