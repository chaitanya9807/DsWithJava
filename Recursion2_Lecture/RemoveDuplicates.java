package Codezen_Codes.Recursion2_Lecture;

import java.util.Scanner;

public class RemoveDuplicates {
    public static Scanner s = new Scanner(System.in);
    public static String Remove(String str){
        if(str.length()==0){
            return "";
        }
        String str1="";
        str1+=Remove(str.substring(1));
        if(str1.length()!=0&&str.charAt(0)==str1.charAt(0)){
            return str1;
        }else {
            str1 = str.charAt(0) + str1;
            return str1;
        }
    }
    public static void main(String[] args){
        String str=s.nextLine();
        System.out.print(Remove(str));
    }
}
