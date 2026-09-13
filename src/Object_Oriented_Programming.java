import java.util.Random;
import java.util.Scanner;

public class Object_Oriented_Programming {
    public static void main(String[] args){

        // Object = An entity that holds data (attributes)
        // and can perform actions (methods)
        // It is a reference data type - we store
        // the data in the objects in the heaps

        // eg - a human can have int age; , String name; , double weight; etc [attributes]
        // and can eat() , sleep() , play() [methods] etc

        // objects can have things (attributes) and can do things (methods)

        // class - a blue print to create objects

        // both scanner and the random are also the objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // creating the car object
        // we have to follow the same pattern as follows
        Car car = new Car();

        // as objects are the reference data types therefore
        // if we try to run the following statement we will get its
        // memory address as - Car@1be6f5c3
        System.out.println(car);

        // if you want to access the attributes then you have to use the
        // (.) dot-operator - (it allows the user to access things within the object)
        // and then write the attribute name
        // i.e object_name.attribute_name
        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        // you can also modify the attributes in the object too
        car.isRunning = true;
        System.out.println(car.isRunning);

        // objects can perform actions they can also contain methods

        // calling the car methods
        System.out.println(car.isRunning);

        car.start();
        System.out.println(car.isRunning);

        car.stop();
        System.out.println(car.isRunning);

        // using other methods
        car.drive();
        car.brake();

        // creating same object again

        // with the class of car with the every method we make has
        // the same attribute and methods

        Car car2 = new Car();

        // here we will get the same output in both the cases
        // as these cars have the same attributes
        System.out.println(car.make+" "+car.model);
        System.out.println(car2.make+" "+car2.model);

        // STEPS :
        // 1. create a new java class named - Car
        // 2. create some variables in that class
        // 3. and come back toh this file
        // 4. create the car object in this file
        // 5. and continue in this file

    }
}
