package StringTask;

import java.util.Scanner;

public class loginFuncion {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter your username");
        String username= scan.nextLine();
        System.out.println("enter your password");
        String pas = scan.nextLine();
        scan.close();
        String s1= "cydeo";
        String s2="woodenSpoon";
       boolean result=(s1.equals(username));
       boolean result2=(s2.equals(pas));
       if (result==true){
           System.out.println("logged in.");

       }else{
           System.out.println("incorrect username or password");
       }













    }
}
