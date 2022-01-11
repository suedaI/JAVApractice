package StringTask;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first word");
String word1= scan.next();
        System.out.println("enter your second word");
String word2= scan.next();
        System.out.println("enter your 3 word");
String word3=scan.next();

scan.close();
String result="";
if (word1.equals(word2)&& word2.equals(word3)){
    System.out.println("all word are same lengt");

}else if(word1.equals(word2)){
    System.out.println("Not Same nor Different lengths");
}else if (word1.equals(word3)){
    System.out.println("Not Same nor Different lengths");

}else if (word2.equals(word3)){
    System.out.println("Not Same nor Different lengths");
}else{

    System.out.println("all differents");

}
        System.out.println(result);







    }
}
