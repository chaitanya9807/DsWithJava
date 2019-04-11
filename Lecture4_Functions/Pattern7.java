package Lecture4_Functions;

import java.util.Scanner;

/*

        1
       11
      111
     1111
    11111

 */
public class Pattern7 {
    public static void PatternPrint7(int n){
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int c=1;c<=i;c++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        PatternPrint7(n);
    }

}
