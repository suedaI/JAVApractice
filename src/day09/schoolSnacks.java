package day09;

public class schoolSnacks {
    public static void main(String[] args) {
        byte age = 15;
        boolean elementry = age >= 1 && age <= 1;
        boolean middle = age >= 6 && age <= 8;
        boolean high = age >= 9 && age <= 12;
        boolean College = age >= 13 && age <= 16;
        boolean Grand = age >= 17 && age <= 18;
        if (elementry) {
            System.out.println("elementry");
        }
        if (middle) {
            System.out.println("middle");
        }
        if (high) {
            System.out.println("high");
        }
        if (College) {
            System.out.println("college");
        }
        if (Grand) {
            System.out.println("grand");
        }

        System.out.println("=========================");
        int num1 = 400;
        int num2 = 400;
        boolean equal = num1 == num2;
        if (equal){
            System.out.println("equal");
        }


        System.out.println("-------------");







    }
}

