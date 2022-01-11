package day13;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the reserve string");
        String word=scan.next();

        String result="";
        if(word.length() ==  5){
            result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);
        }else if(word.length() > 5){
            result = "Too long!";
        }else{
            result = "Too short!";
        }

        System.out.println(result);
    }
}
