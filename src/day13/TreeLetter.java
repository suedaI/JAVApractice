package day13;

import java.util.Scanner;

public class TreeLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write first words;");
        String word1=scan.nextLine();
        System.out.println("write a second words");
       String word2=scan.nextLine();
        System.out.println("write a 3. word");
        String word3=scan.nextLine();
        int a1=word2.length();
        int a2=word2.length();
        int a3=word3.length();
        if (a1==a2&&a2==a3){
            System.out.println("all the words same lengths");
        }else if (a1==a2){
            System.out.println("not same nor diffrent lengths");

        }else if (a3==a2){
            System.out.println("not same nor different lengths");
        }else if (a1==a3){
            System.out.println("not same nor different lengths");

        }else{
            System.out.println("all diffrents lentgs");
        }



    }
}
