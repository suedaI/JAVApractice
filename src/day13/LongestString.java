package day13;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first sentence");
        String first=scan.next();
        System.out.println("enter the second sentence");
        String second=scan.next();
       scan.close();
       if (first.length() >second.length()){
           System.out.println(first);
       }else {
           System.out.println(second);
       }

    }
}
