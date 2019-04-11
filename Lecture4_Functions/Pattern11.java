package Lecture4_Functions;

import java.util.Scanner;

/*

    1
    23
    345
    4567
    56789

 */
public class Pattern11 {
    public static void PatternPrint11(int n){
        for(int i=1;i<=n;i++){
            int a=i;
            for(int c=1;c<=i;c++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        PatternPrint11(n);
    }
}
