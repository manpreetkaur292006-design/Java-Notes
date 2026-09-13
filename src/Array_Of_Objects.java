public class Array_Of_Objects {
    public static void main(String[] args){

        // creating the array of objects

        Car2 car1 = new Car2("Mustang","Red");
        Car2 car2 = new Car2("Jaguar","Black");
        Car2 car3 = new Car2("Charger","Yellow");

        Car2[] cars = {
                car1,car2,car3
        };

        // method -1 : simple for loop
        for(int i=0; i<cars.length; i++){
            cars[i].drive();
        }

        // method -2 : enhanced for loop
        for(Car2 car : cars){
            car.drive();
        }

        // another thing that you can do in the array of objects
        // is that you can pass the anonymous objects rather than
        // first instantiating the objects and than assigning them
        // to the array

        // these are known as anonymous objects - new Car2("Mustang", "Red")
        Car2[] carss = {
                new Car2("Mustang", "Red"),
                new Car2("Jaguar", "Black"),
                new Car2("Charger", "Yellow")
        };

        for(Car2 car : carss){
            car.drive();
        }

        for(Car2 car : carss){
            car.color="Black";
        }

        for(Car2 car : carss){
            car.drive();
        }

    }
}
