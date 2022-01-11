package day27;

public class LetterOrDigit {
    public static void main(String[] args) {
        String str="wooden spoon!";
        String letters="";
        String digits="";
        String specialCharcters="";

       for (int i=0;i<str.length();i++){
           char each=str.charAt(i);
           if (Character.isDigit(each)){
               digits+=each;
           }else if (Character.isLetter(each)){
               letters+=each;
           }else{
               specialCharcters+=each;
           }
       }

        System.out.println("specialCharcters = " + specialCharcters);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);

    }
}
