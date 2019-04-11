package Codezen_Codes.Lecture2;
/*

    1
    23
    345
    4567

 */
public class NumberPattern1 {
    public static void main(String[] args){
        int row=1;
        while(row<=4){
            int c=1;
            int a=row;
            while(c<=row){
                System.out.print(a);
                c++;
                a++;
            }
            row++;
            System.out.println();
        }
    }
}
