package Lecture4_Functions;

import java.util.Scanner;

/*

    1
    12
    123
    1234
    12345

 */
public class Pattern5 {
    public static void PatternPrint5(int n){
        for(int i=0;i<=n;i++){
            for(int c=1;c<=i;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        PatternPrint5(n);
    }
}
