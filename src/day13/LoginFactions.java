package day13;

import java.util.Scanner;

public class LoginFactions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the username");
        String username=scan.next();
        System.out.println("enter the password");
        String passaport= scan.next();


        String result="";
        if (username.equals("Cydeo")&&passaport.equals("WooddenSpoon")){
            System.out.println("logged in");
        }else{
            System.out.println("incorrect username or password");
        }


    }
}
