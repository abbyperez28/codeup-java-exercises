package shapes;

//public class Rectangle {

//    protected int length;
//    protected int width;
//
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea() {
//        return this.length * this.width;
//    }
//
//    public int getPerimeter() {
//        return this.length * 2 + this.width * 2;
//    }

//}

//----------------------------------------------------------------
//Interface and Abstract Exercise

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}