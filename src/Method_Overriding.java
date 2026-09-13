public class Method_Overriding {
    public static void main(String[] args){

        // Method overriding = when a subclass provides its own
        // implementation of a method that is already defined.
        // allows for code reusability and give specific implementations

        Dog_s dog_s = new Dog_s();
        Cat_s cat_s = new Cat_s();
        Fish fish = new Fish();

        // as animal inherited the properties these subclasses
        // therefore they will have move method in that also
        dog_s.move();
        cat_s.move();
        // the move method is inappropriate for fish
        // as fished can't run and the message says the
        // fish is running - therefore we have overridden this method
        fish.move();

    }
}
