package day23;

public class DollarToEuro {
    public static void main(String[] args) {
dollarToEuro(5);
    }
    public static void dollarToEuro (double num){
        double euro=num*1.33;
        System.out.println(num + " dollar equal to "+euro+" euro");
    }
}
