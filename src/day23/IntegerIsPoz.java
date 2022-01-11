package day23;

public class IntegerIsPoz {
    public static void main(String[] args) {
        integernum(0);
    }
    public static void integernum (int num){
        if (num>0){
            System.out.println("result is positive");
        }else if (num==0){
            System.out.println("result is zero");
        }else{
            System.out.println("result is negative");
        }
    }
}
