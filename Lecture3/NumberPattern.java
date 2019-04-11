package Codezen_Codes.Lecture3;

/*

    333
    233
    123

 */

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int a=n;
        for(int i=1;i<=n;i++){
            a=n-i+1;
            for(int c=1;c<=i;c++){
                System.out.print(a);
                a++;
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
