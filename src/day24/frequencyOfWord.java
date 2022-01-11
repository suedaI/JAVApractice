package day24;

public class frequencyOfWord {
    public static void main(String[] args) {

    }
    public static int sentence (String str1, String str2){
        int count=0;
        while (str1.contains(str2)){
            str1=str1.replaceFirst(str2,"");
            count++;
        }
        return count;
    }
}
