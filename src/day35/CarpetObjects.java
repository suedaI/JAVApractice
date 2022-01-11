package day35;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet();
        carpet1.setLength(22);
        carpet1.setWidth(11);
        carpet1.setUnitPrice(2);
        carpet1.setPersian(true);
        carpet1.callCost();
        System.out.println(carpet1.getLength());
        System.out.println(carpet1.getWidth());
        System.out.println(carpet1.callCost());
        System.out.println(carpet1.isPersian());
        System.out.println(carpet1.getUnitPrice());
        System.out.println("===========");
        System.out.println(carpet1);
    }
}
