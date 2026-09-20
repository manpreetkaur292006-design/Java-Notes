public class Interfaces {
    public static void main(String[] args){

        // Interface = a blueprint for a class that specifies a set
        // of abstract methods that implementing classes MUST define .
        // supports multiple inheritance - like behavior.

        // normally in inheritance a class can only have a single parent
        // but by using interfaces a class can have multiple parents
        // like two , three or more

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        // the rabbit donot have the hunt method and
        // hawk do not have the flee method

        // the one key difference between the interfaces and the
        // abstract classes is that you can implement more than one
        // interface - like fish eat smaller fish and flee larger fish
        // as implemented here
        Fishes fishes = new Fishes();
        fishes.flee();
        fishes.hunt();
        // a class can implement more than one interfaces

    }
}
