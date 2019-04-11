package Lecture10_Recursion2;

import java.util.Scanner;

public class AllSubsequences {
    public static Scanner s = new Scanner(System.in);

    public static String[] AllSubstr(String str){
        if(str.length()==0){
            String[] base={""};
            return base;
        }
        String[] subsequenceofsmallerstring=AllSubstr(str.substring(1));
        String[] totalSubsequences=new String[subsequenceofsmallerstring.length*2];
        int i=0;
        for(;i<subsequenceofsmallerstring.length;i++){
            totalSubsequences[i]=subsequenceofsmallerstring[i];
        }
        int j=0;
        for(;i<totalSubsequences.length;i++,j++){
            totalSubsequences[i]=str.charAt(0)+subsequenceofsmallerstring[j];
        }
        return totalSubsequences;
    }
    public static void main(String[] args){
        String str=s.nextLine();
        String[] str1=AllSubstr(str);
//        for(int i=0;i<str1.length;i++){
//            System.out.print(str1[i]+"  ");
//        }
        // For Each LOOP
        for(String a:str1){
            System.out.println(a);
        }
    }
}
