package Day14;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String first= scan.next();
        String lastTwo= first.substring(first.length()-2);
        if (lastTwo.equals("ly")){
            System.out.println("really?");
        }else{
            System.out.println("never mind");
        }
        scan.close();












    }
}
