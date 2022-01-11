package day29;

import java.util.ArrayList;

public class SpecialChar {
    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG!";

        ArrayList<Character> chars=new ArrayList<>();

        for (int i=0; i<str.length();i++){
            chars.add(str.charAt(i));
        }
ArrayList<Character> letter=new ArrayList<>(chars);//char yazarsan urunler eklenir.
        letter.removeIf(p->!Character.isLetter(p));
        System.out.println("letter = " + letter);

        ArrayList<Character> digits=new ArrayList<>(chars);
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialCharacter=new ArrayList<>(chars);
        specialCharacter.removeIf(p->Character.isLetterOrDigit(p));
        System.out.println("specialCharacter = " + specialCharacter);






    }
}
