package day27;

public class UpperLowerCase {
    public static void main(String[] args) {

        String str="JAVA java";
        int countUpper=0;
        int countLover=0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpper++;

            }
            if (Character.isLowerCase(each)) {
                countLover++;
            }
        }
            boolean result=countLover==countUpper;
            System.out.println(result);






    }
}
