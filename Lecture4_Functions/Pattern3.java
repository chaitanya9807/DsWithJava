package Lecture4_Functions;
/*

    1
    11
    111
    1111
    11111

 */
import java.util.Scanner;

public class Pattern3 {
    public static void PatternPrint3(int n) {
        for(int i=1;i<=n;i++){
            for(int c=1;c<=i;c++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        PatternPrint3(n);
    }


}
