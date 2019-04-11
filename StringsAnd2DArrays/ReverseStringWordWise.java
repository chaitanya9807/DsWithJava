package Codezen_Codes.StringsAnd2DArrays;

import java.util.Scanner;

public class ReverseStringWordWise {
    public static Scanner s = new Scanner(System.in);

    public static String Reverse(String str){
        String str1="";
        int startpos=-1;
        int endpos=str.length();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                startpos=i+1;
                str1+=str.substring(startpos,endpos)+" ";
                endpos=i;
            }
            else if(i==0){
                startpos=i;
                str1+=str.substring(startpos,endpos)+" ";
            }
        }
        return str1;
    }
    public static void main(String[] args){
        String str=s.nextLine();
        System.out.print(Reverse(str));
    }
}
