// this file is made for illustrating the
// toString method in java

public class Car_TS {

    String make;
    String model;
    int year;
    String color;

    Car_TS(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // this method is normally available to all objects
    @Override
    // used public as we are creating a publically accessible method
    public String toString(){
        return this.color+" "+this.year+" "+this.make+" "+this.model;
    }

}
