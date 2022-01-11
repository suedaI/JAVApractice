package day24;

public class Palindrome {
    public static void main(String[] args) {

    }
    public static boolean palindrome(String str){
        return Reverse.reserve(str).equalsIgnoreCase(str);
    }
}
