package day31;

public class Item {

    public String name;
    public double price;
    public int quantity;


    public double calCost() {
        double totalprice = price * quantity;

        return totalprice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price= $ " + price +
                ", quantity=" + quantity +
                ", totalprice= $ " + calCost() +


                '}';
    }


    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
}

