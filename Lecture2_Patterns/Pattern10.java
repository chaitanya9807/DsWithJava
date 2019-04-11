package Lecture2_Patterns;

/*

            1
           23
          345
         4567
        56789

 */

import java.util.Scanner;

public class Pattern10 {
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
                int a=1;
                while(count<=row){
                    System.out.print(a);
                    a++;
                    count++;
                }
                System.out.println();
                row++;
            }
        }
}
