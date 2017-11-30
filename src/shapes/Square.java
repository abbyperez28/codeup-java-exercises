package shapes;

//public class Square extends Rectangle {
////    int side;
////
////    public Square(int side) {
////        super(side, side);
////        this.side = side;
////    }
////
////    public int getArea() {
////        return side * 2;
////    }
////
////    public int getPerimeter() {
////        return 4 * side;
////    }
//}



//------------------------------------------------------
//Abstract and Interface Exercise

public class Square extends Quadrilateral {

    protected double side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }


    @Override
    public void setLength(double side) {

    }

    @Override
    public void setWidth(double side) {

    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * 2;
    }
}
