package Codezen_Codes.Recursion2_Lecture;

import java.util.Scanner;

public class ReplaceCharacter {
    public static Scanner s = new Scanner(System.in);
    public static String Replace(String str, char c1, char c2){
        if(str.length()==0){
            return "";
        }
        String str1="";
        if(str.charAt(0)==c1){
            str1+=c2;
        }
        else{
            str1+=str.charAt(0);
        }
        str1+=Replace(str.substring(1),c1,c2);
        return str1;
    }
    public static void main(String[] args){
        String str=s.nextLine();
        char c1=s.next().charAt(0);
        char c2=s.next().charAt(0);
        System.out.print(Replace(str,c1,c2));
    }
}