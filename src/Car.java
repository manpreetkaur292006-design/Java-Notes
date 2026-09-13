// this file is made to show how the object
// oriented programming works in java

public class Car {

    // ILLUSTRATION

    // these are the things that the object car has
    // these are called as the attributes

    String make = "Ford";
    String model = "Mustang";
    int year = 2026;
    double price = 58000.40;
    boolean isRunning = false;

    // defining methods

    void start(){
        isRunning=true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning=false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the "+model);
    }

    void brake(){
        System.out.println("You brake the "+model);
    }

    // Static is not used here
    // because this determines whether the method belongs
    // to the class itself or to each object created from
    // the class
    // here we donot used this because these methods belongs to
    // the object class
    // when something belongs to the class as a whole rather than
    // to an individual object then we use static in this case

}
