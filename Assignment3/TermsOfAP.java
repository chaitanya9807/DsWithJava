package Codezen_Codes.Assignment3;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1,j=n;
        while(i<=n&&j>=0){
            int term=(3*i)+2;
            if(term%4!=0){
                System.out.print(term+" ");
                j--;
            }
            i++;
        }
    }
}
