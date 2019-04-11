package Codezen_Codes.Assignment2;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class RootsOfQuadratic {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=(b*b)-(4*a*c);
        if(d>0){
            double m=((-1)*b+sqrt(d))/(2*a);
            double n=((-1)*b-sqrt(d))/(2*a);
            System.out.println("1");
            System.out.print(Math.round(m)+" "+Math.round(n));
        }
        else if(d == 0){
            double m=((-1)*b+sqrt(d))/(2*a);
            System.out.println("0");
            System.out.print(Math.round(m)+" "+Math.round(m));
        }
        else{
            System.out.print("-1");
        }

    }
}
