package day23;

import java.util.Arrays;

public class Annagram {
    public static void main(String[] args) {
annagram("silent","listen");
    }
    public static void annagram(String name1,String name2){
        char[]ch1=name1.toCharArray();
        char[]ch2=name2.toCharArray();
        Arrays.sort(ch1);
Arrays.sort(ch2);
if (Arrays.equals(ch1,ch2)){
    System.out.println("anagram");
}else{
    System.out.println("not anagram");
}
    }
}
