package day35;

public class Rectangle {

    private int width;
    private int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<0){
            return;
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<0){
            return;
        }
        this.length = length;



    }
    public double calArea(){
        return width*length;
    }

    public double calPerimeter(){
         return (length + width);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calArea() +
                ", perimeter=" + calPerimeter() +
                '}';
    }
}