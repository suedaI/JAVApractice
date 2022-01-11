package day23;

public class DollarToLira {
    public static void main(String[] args) {
        dollarToLira(5);
    }
    public static void dollarToLira(double dollar){
        double lira=dollar*18;
        System.out.println(lira+" lira equal to "+dollar+" dolar");
    }
}
