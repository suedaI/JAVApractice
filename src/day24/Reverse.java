package day24;

public class Reverse {
    public static void main(String[] args) {

    }

    public static String reserve(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }


    }

