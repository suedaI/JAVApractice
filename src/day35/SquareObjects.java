package day35;

public class SquareObjects {
    public static void main(String[] args) {

Square square1=new Square();
square1.setSide(3);
square1.calcPerimeter();

square1.calcArea();
square1.toString();

        System.out.println(square1.getSide());
        System.out.println("-------");
        System.out.println(square1.calcArea());
        System.out.println("======");
        System.out.println(square1.calcPerimeter());
        System.out.println("_____________");
        System.out.println(square1.toString());
    }
}