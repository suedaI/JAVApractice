package StringTask2;

import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter  a word");
        String word = scan.next();
        scan.close();
        String result = "";

        if (word.length() == 5) {
            result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);
        } else if (word.length() > 5) {


            result = "too long";
        }else{
            result= "too short";
        }
        System.out.println(result);
        System.out.println("-result");




    }

}
























