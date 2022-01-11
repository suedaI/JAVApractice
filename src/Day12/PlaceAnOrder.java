package Day12;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter the order name");
String orderName = scan.nextLine();
        System.out.println("enter the price");
double price = scan.nextDouble();
        System.out.println("enter the quantity");
int quantity = scan.nextInt();
        System.out.println("enter the first name");
String name = scan.next();
double total = price * quantity;
        System.out.println(name + " ,your order for "+ quantity + " " + orderName + " has been places." + " your total is " + total + "." );



    }

}
