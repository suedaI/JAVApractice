package day13;

import java.util.Scanner;

public class FirstAndLastChracters {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter the first name");
        String firstname= scan.next();
        System.out.println("enter the last name");
        String lastname=scan.next();
        scan.close();
     char first= firstname.charAt(0);
       char last= lastname.charAt(0);
        System.out.println(first+"."+last);
    }
}
