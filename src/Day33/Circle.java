package Day33;

public class Circle {
    public double radius;
    public double diameter;

    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcArea(){
        return diameter* pi;
    }
    public double calcPerimeter(){
        return diameter * pi;
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea()+
                ", perimeter=" + calcPerimeter()+
                '}';
    }
}
