// this file is made to illustrate the concept of abstraction

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    double area(){
        return length*breadth;
    }

}
