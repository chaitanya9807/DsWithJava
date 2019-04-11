package Codezen_Codes.StringsAnd2DArrays;

import java.util.Scanner;

public class RemoveCharacter {
    public static Scanner s = new Scanner(System.in);
    public static String remove(String str,char c){
        String str1="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=c){
                str1+=str.charAt(i);
            }
        }
        return str1;
    }
    public static void main(String[] args){
        String str=s.nextLine();
        char c=s.next().charAt(0);
        System.out.print(remove(str,c));
    }
}
