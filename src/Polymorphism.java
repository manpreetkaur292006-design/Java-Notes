public class Polymorphism {
    public static void main(String[] args){

        // Polymorphism = "POLY" : "MANY" (Polymorphism is a greek word)
        // "MORPH" : "SHAPE"
        // Objects can identify as other objects
        // Objects can be treated as objects of a common superclasses.

        // like a dog is identifies as a dog but also it is identified as an anima
        // it can also be identifies as an organism and object
        // there fore it can identify more than one things

        Car3 car3 = new Car3();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car3.go();
        bike.go();
        boat.go();

        // let say we are going to start a race between these vehicles

//        Car3[] cars = {
//                car3,bike,boat
//        };
        // ERROR : java: incompatible types: Bike cannot be converted to Car3
        // bikes and boats cannot identified as cars but cars can be identified as cars

//        Bike[] bikes = {car3,bike,boat};
//        Boat[] boats = {car3,bike,boat};
        // both the above statements will also lead to similar kind of errors

        // but we could declare the array what they have common that is vehicle class
        // they also identified vehicles
        Vehicle[] vehicles = {car3,bike,boat};
        // using go method for these elements in the array
        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }

        // polymorphism can also be achieved by using interfaces
        // 1. for that create a vehicle interface
        // 2. rather than extending the vehicle we will implement it
        // means replace extend by implement
        // 3. declare void go(); in vehicle
        // 4. place public in the overrride methods that were created go()

    }
}
