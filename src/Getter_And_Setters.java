public class Getter_And_Setters {
    public static void main(String[] args) {

        // they help protect object data and add rules for accessing
        // or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        // creating the car object
        Car_GS carGs = new Car_GS("Charger","Yellow",10000);
//        System.out.println(carGs.color+" "+carGs.model+" "+carGs.price);

//        carGs.model="Cotvetter";
//        System.out.println(carGs.color+" "+carGs.model+" "+carGs.price);
        // when we try to access these private variables we will get errors
        // and we cannot normally access them - that is why we use getters and setters

        // getter methods - calling the getter methods
         System.out.println(carGs.getColor()+" "+carGs.getModel()+" "+carGs.getPrice());

        // calling the setter methods
        carGs.setColor("Blue"); // use this inplace of carGs.color="Blue"; etc
        carGs.setPrice(5000);
        System.out.println(carGs.getColor()+" "+carGs.getModel()+" "+carGs.getPrice());

        // we have not made model updatable and not make the setModel method
        // therefore we cannot modify the model - and leads to error
        // to make it editable add this method

        carGs.setPrice(-5000);
        System.out.println(carGs.getColor()+" "+carGs.getModel()+" "+carGs.getPrice());

    }
}