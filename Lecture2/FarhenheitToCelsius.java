package Codezen_Codes.Lecture2;

import java.util.Scanner;

public class FarhenheitToCelsius {
    public static void main(String[] args){
        // 5/9*(F-32)
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int w=s.nextInt();
        int c=0;
        int i=S;
        while(i<=E){
            c=(i-32)*5/9;
            System.out.println(i+"\t"+c);
            i=i+w;
        }
    }
}
