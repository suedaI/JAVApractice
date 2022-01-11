package day35;

public class Square {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side<0){
            return;
        }
        this.side = side;
    }
    public static double pi;
    static {
        pi=3.14;
    }
    public double calcArea(){
       return side*side*pi;
    }
    public double calcPerimeter(){
       return  4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
