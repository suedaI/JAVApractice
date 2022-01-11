package StringTask;

import java.util.Scanner;

public class TreeWord {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a 3 letter word ");
        String word= scan.next();
        scan.close();

        if (word.length()==3){
            if (word.charAt(1)=='a'){
                System.out.println("cool word");
            }
        }else{
            if (word.length()>3){
                System.out.println("word to long");
            }else{
                System.out.println("word is too short");
            }
        }









    }
}
