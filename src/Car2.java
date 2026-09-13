// this class is made to illustrate the concept
// of array of objects in jave

public class Car2 {

    String model;
    String color;

    Car2(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the "+this.color+" "+this.model);
    }

}
