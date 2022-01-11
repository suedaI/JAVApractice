package mathCustomMethod;

public class Math {
    public static void main(String[] args) {

    }

    //2.1 Create a method that can return the sum of two integers
    public static int sum(int n1, int n2) {
        return n1 + n2;

    }

    //2.2 Create a method that can return the sum of two decimal numbers
    public static double sum(double n1, double n2) {
        return n1 + n2;
    }

    //2.3 Create a method that can return the subtraction of two integers
    public static int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    //2.4 Create a method that can return the subtraction of two decimals
    public static double subtraction(double n1, double n2) {
        return n1 - n2;

    }

    //2.5 Creat a method that can return the multiplication of two integers
    public static int multiplication(int n1, int n2) {
        return n1 * n2;

    }

    //2.6 Create a method that can return the multiplication of two decimals
    public static double multiplication(double n1, double n2) {
        return n1 * n2;

    }

    //2.7 Create a method that passes two double parameters and return the division reslt
    public static double division(double n1, double n2) {
        return n1 / n2;
    }

    //2.8 Create a method that can check if an integer is even number
    public static boolean evenNum(int num) {
        return num % 2 == 0;
    }

    //2.9 Create a method that can check if an integer is odd number
    public static boolean odd(int num) {
        return (num % 2 == 0);
    }

    //2.10 Create a method that can return the maximum number between two integers
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : (num2 > num1) ? num2 : num1;

    }

    //2.11 Create a method that can return the maximum number between two decimal numbers
    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : (num2 > num1) ? num2 : num1;

    }

    //2.12 Create a method that can return the minimum number between two integers
    public static int min(int num1, int num2) {
        return (num1 < num2) ? num1 : (num2 < num1) ? num2 : num1;

    }

    //2.13 Create a method that can return the minimum number between two decimal numbers
    public static double min(double num1, double num2) {
        return (num1 < num2) ? num1 : (num2 < num1) ? num2 : num1;
    }

    //2.14 Create a method that can return the square of an integer
    public static int square(int num) {
        return num * num;
    }

    //2.15 Create a method that can return the square of a double
    public static double square(double num) {
        return num * num;
    }

    //2.16 Create a method that can return the cube of an integer
    public static int cube(int num) {
        return num * num * num;
    }

    //2.17 Create a method that can return the cube of a double
    public static double cube(double num) {
        return num * num * num;
    }


}




