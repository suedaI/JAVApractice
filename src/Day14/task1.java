package Day14;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your first word");
String first=scan.next();
        System.out.println("enter your second word");
String second=scan.next();
scan.close();

 String result= first.substring(1)+second.substring(1);
        System.out.println("result = " + result);











    }
}
