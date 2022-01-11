package day35;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {

        boolean isEmpty = true, isBlank = true, isChar = true, isLetter = true, isPriceOk = false, isQuantityOk = false,
                isToiletPaperOk = false;
        String errors = "";

        if (name.isEmpty()) {
            errors += "Item name can not be empty\n";
            isEmpty = false;
        }

        if (name.isBlank()) {
            errors += "Item name can not be blank\n";
            isBlank = false;
        }

        if (name.length() > 1 && !Character.isLetter(name.charAt(0))) {
            errors += "Item name must start with letters\n";
            isLetter = false;
        }

        for (int i = 1; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != ' ') isChar = false;
        }
        if (!isChar) errors += "Item name can not contain any special characters other than space\n";

        if (name.equalsIgnoreCase("toilet paper") && quantity != 1)
            errors += "Toilet paper quantity can not be more than 1\n";
        else isToiletPaperOk = true;

        if (unitPrice < 1) errors += "Price can not be 0 or negative\n";
        else isPriceOk = true;

        if (quantity < 1) errors += "Quantity can not be 0 or negative\n";
        else isQuantityOk = true;

        if (!isEmpty || !isBlank || !isLetter || !isChar || !isToiletPaperOk || !isPriceOk || !isQuantityOk) {
            System.err.println(errors);
            System.exit(0);
        } else {
            setName(name);
            setQuantity(quantity);
            setUnitPrice(unitPrice);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calcCost(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=$" + unitPrice +
                ", quantity=" + quantity +
                ", Total cost=$" + calcCost(unitPrice, quantity) +
                '}';
    }

    public static void main(String[] args) {
        Item item1 = new Item("a  122 !", 56.6, 8);
        System.out.println(item1);
    }
}

