package Codezen_Codes.StringsAnd2DArrays;

import java.util.Scanner;

public class CheckPermutation {
    public static Scanner s = new Scanner(System.in);

    public static Boolean Check(String str, String str1) {
        String str2="";
        int k=0;
        int count1=0,count2=0;
        if(str.length()==str1.length()){
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str.charAt(i)==str2.charAt(j)){
                        continue;
                    }
                }
                str2+=str.charAt(k++);
                for(int j=0;j<str1.length();j++){
                    if(str1.charAt(j)==str.charAt(i)){
                        count2++;
                    }
                }
                for(int p=0;p<str.length();p++){
                    if(str.charAt(p)==str.charAt(i)){
                        count1++;
                    }
                }
                if(count1!=count2){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = s.nextLine();
        String str1 = s.nextLine();
        System.out.print(Check(str, str1));
    }
}
