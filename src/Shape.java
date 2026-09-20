// this file is made to illustrate the concept of abstraction

// this will be our abstract class means we can't create any
// shape objects before the word of class - as we have added the
// keyword of abstract here

public abstract class Shape {

    // this means that every child class needs this method area()
    abstract double area(); // this is an abstract method

    // this method should be implemented in the child class as this
    // helps us to maintain the consistency between the children classes

    // concrete methods are defined and inherited within an abstract class
    void display(){
        System.out.println("This is a shape"); // this is a concrete method
        // this method is inherited from the shape class
    }


}
