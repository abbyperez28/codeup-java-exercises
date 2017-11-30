package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//
//        Rectangle box1 = new Rectangle(4,5);
//            System.out.println("The rectangle's perimeter is: " + box1.getPerimeter());
//            System.out.println("The rectangle's area is : " + box1.getArea());
//
//        Square box2 = new Square(5);
//            System.out.println("The square's perimeter is: " + box2.getPerimeter());
//            System.out.println("The square's area is : " + box2.getArea());
//
//
     Measurable myShape;
     myShape = new Square(10);
        System.out.println("The square's perimeter is : " + myShape.getPerimeter());
        System.out.println("The square's area is: " + myShape.getArea());

    myShape = new Rectangle(4,6);
        System.out.println("The rectangle's perimeter is: " + myShape.getPerimeter());
        System.out.println("The rectangle's area is: " + myShape.getPerimeter());
    }
}
