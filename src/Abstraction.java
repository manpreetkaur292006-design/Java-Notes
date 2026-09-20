import java.awt.Shape;

public class Abstraction {
    public static void main(String[] args){

        // abstract = used to define abstract classes and methods
        // abstraction is the process of hiding implementation details
        // and showing only the essential features;
        // abstract classes can't be instantiated directly
        // can contain 'abstract' methods (which must be implemented (by its children) )
        // can contain 'concrete' methods (which are inherited)

        // the following line will lead to an error as the shape object
        // is an abstract and it cannot be instantiated
//        Shape shape = new Shape();

        // as shape is an abstract class so we cannot create any object
        // from this class - it adds a little bit of security to our program

        // we can create these object just not shape
        // because it is an abstract class
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(6,7);

        // printing the area and calling the area function
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

        // concrete method
        circle.display();
        triangle.display();
        rectangle.display();
    }
}
