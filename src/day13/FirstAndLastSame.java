package day13;

import java.util.Scanner;

public class FirstAndLastSame {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence=scan.next();
        scan.close();
        if (sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

    }
}
