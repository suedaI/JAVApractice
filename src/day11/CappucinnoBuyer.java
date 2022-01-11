package day11;

public class CappucinnoBuyer {
    public static void main(String[] args) {

       String size="grande";
       int calori=0;
       double price=0.0;


switch (size){
    case"tall":
        price=3.98;
        calori=90;
        break;
    case"grande":
        price=3.99;
        calori=120;
        break;
    case "venti":
        price=4.29;
        calori=150;
    break;
    default:
    System.err.println("invalid size: " + size);

}


if (price!=0){
    System.out.println("price is: "+price);
    System.out.println("calories: "+calori);
}








    }
}
