// this file is made to implement composition in java

public class Car_Comp {

    String model;
    int year;
    Engine engine; // engine object

    Car_Comp(String model,int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); // calling the new constructor
    }

    void start(){
        this.engine.start(); // calling the start method
        System.out.println("The "+this.model+" is running");
    }
}
