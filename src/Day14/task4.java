package Day14;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word= scan.next();
        if (word.charAt(0)== 'x'){
            word=word.replaceFirst("x","");
        }

        System.out.println(word);

    }
}
