public class Inheritance {
    public static void main(String[] args){

        // inheritance - one class inherits the attributes and
        // methods from another class. (Child <- Parent)

        // Multi-lined inheritance - Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();
        // both dog and cat classes have nothing in them
        // but we have specified that extends animal thing
        // so we are getting things fron the animal class

        // instead of writing the similar code in both cat and
        // dog we have wrote this in the one single class animal
        // and we have inherited this in both the files this reduces
        // code redundancy and make easy for us to make changes if we
        // have a large number of files with this similar code
        // then we just have to make the change in a single file
        // rather than making changes separately in 1000 different files

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        // creating the plant class
        Plant plant = new Plant();
        System.out.println(plant.isAlive); // inherited from organism
        plant.photosynthesize();

//        dog.photosynthesize();
    // this will lead to the error as dog does not have this method
        // as both animal and plants are not related
    }
}

// it is kinda like we are having a whole family tree like
// organism -> plant and animal
// further animal -> cat and dog
// animal and plant are not related
// they are siblings but not related