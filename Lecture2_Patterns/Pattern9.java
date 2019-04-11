package Lecture2_Patterns;

/*

        1
       12
      123
     1234
    12345

 */

import java.util.Scanner;

public class Pattern9 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int row=1;
            while(row<=n){
                int space=1;
                while(space<=(n-row)){
                    System.out.print(" ");
                    space++;
                }
                int count=1;
                while(count<=row){
                    System.out.print(count);
                    count++;
                }
                System.out.println();
                row++;
            }
        }
}
