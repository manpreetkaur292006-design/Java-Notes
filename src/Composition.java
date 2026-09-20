public class Composition {
    public static void main(String[] args){

        // Composition = Represents a "part-of" relationship between objects.
        // For example , an Engine is "part-of" a car.
        // Allows complex objects to be constructed form smaller objects.

        Car_Comp carComp = new Car_Comp("Corvette",2025,"V8");
        System.out.println(carComp.model);
        System.out.println(carComp.year);
        System.out.println(carComp.engine); // engine object
        // output:
        // Corvette
        //2025
        //Engine@2a84aee7

        System.out.println(carComp.engine.type);  // accessing the type of the engine
        // V8
        // we have an object that is composed with another object
        // line carComp object have engine object

        // starting the car
        carComp.start();

        // the key difference in composition is when we delete our car
        // that will also delete our engine as engine is also the part
        // of the car.

    }
}
