package Lecture4_Functions;

import java.util.Scanner;

/*

        1
       12
      123
     1234
    12345

 */
public class Pattern9 {
    public static void PatternPrint9(int n){
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int c=1;c<=i;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        PatternPrint9(n);
    }
}
