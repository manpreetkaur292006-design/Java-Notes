public class ToString_Method {
    public static void main(String[] args){

        // .toString() = method inherited from the object class.
        // used to return a string representation of an object.
        // by default, it returns a hash code as a unique identifier.
        // it can be overridden to provide meaningful details.

        Car_TS car_ts = new Car_TS("Ford","Mustang",2025,"Red");
        Car_TS car_ts2 = new Car_TS("Chevrolet","Corvette",2026,"Blue");

        // by this line we will get the hash code - a unique identifier to the object
        // i.e. it is the unique identifier that uses the object's memory address to calculate
        // a hash
        System.out.println(car_ts);  // output before overriding : Car_TS@8efb846
        // after overriding = Red 2025 Ford Mustang

        // this line is giving us the meaningful details of this car object
        System.out.println(car_ts.color+" "+car_ts.year+" "+car_ts.make+" "+car_ts.model);

        // if we want to print our car object directly using the println statement then
        // we can use this through method overriding - in the car_TS file by creating the
        // toString method
        System.out.println(car_ts);
        System.out.println(car_ts2);

        // the object class also have the toString method but we have to
        // override this to print the output directly you can display the
        // meaningful details

    }
}
