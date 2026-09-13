// this file is used for the implementation of
// method overriding concept in java

// fish inherits from animal_s

public class Fish extends Animal_s{

    // method overriding -
    // as the move method in the animal is inappropriate
    // according to the fish therefore we have
    // overridden that move method in animal class by
    // move method in the fish class

    @Override  // salutation - so that other people
    // get to know that this method is being overridden
    void move(){
        System.out.println("This animal is swimming");
    }

    // if you have the same method having the same name as
    // the parent class then the method inside the fish will
    // run first - this is the precedence

    // @Override - this provides a system of checks and balances
    // when overwriting method this error will go away once we
    // actually are overriding methods

    // like if we missplet move as moves we will never know that this
    // is being missplet that is why we should add the override salutation
    // as it indicates any error when we make any mistake like this

}
