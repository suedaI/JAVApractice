package day13;

import java.util.Scanner;

public class SentenceFirstAndLast {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence=scan.next();
        scan.close();
       char str1= sentence.charAt(0);
        char str2=sentence.charAt(sentence.length()-1);
        System.out.println(str1 +""+str2);
    }
}
