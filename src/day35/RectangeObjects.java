package day35;

public class RectangeObjects {
    public static void main(String[] args) {

        Rectangle rectangle1=new Rectangle();

        rectangle1.setWidth(45);
        rectangle1.setLength(78);
        rectangle1.calPerimeter();
        rectangle1.calArea();
       rectangle1.toString();
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.calArea());
        System.out.println(rectangle1.calPerimeter());
        System.out.println("======");
        System.out.println(rectangle1.toString());
    }
}
