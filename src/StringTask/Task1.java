package StringTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name;");
        String name=scan.next();
        System.out.println("enter your last name;");
        String lastname= scan.next();

        char n= name.charAt(0);
        char l = lastname.charAt(0);
        String intial=n+ "."+l;
        System.out.println("intial = " + intial);
        scan.close();







    }
}
