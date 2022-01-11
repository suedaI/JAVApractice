package day13;

import java.util.Scanner;

public class CheackTheWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a tree letter word");
        String word = scan.next();
        scan.close();
        if(word.length() == 3){
            if(word.charAt(1) == 'a'){
                System.out.println("Cool word");
            }
        }else{
            if(word.length() > 3 ){
                System.out.println("Word is too long");
            }else{
                System.out.println("Word is too short");
            }
        }


    }

}