package day23;

public class EachChar {
    public static void main(String[] args) {
eachChar("sueda");
    }
    public static void eachChar(String str){
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
