public class Anonymous_Classes {
    public static void main(String[] args){

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                  And custom behavior without having to create a new class.
        //                  Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog = new Dog();
        dog.speak();

        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();
        // it is a lot of work to create a new class that overriders
        // the methods to create talking dog  so this is an exception
        // rather than creating an entire new class we will create
        // an anonymous class

        Dog dog1 = new Dog(){
            // define any new features or overrride existing methods
            @Override
            void speak(){
                System.out.println("Scooby doo speaks english");
            }
        };
        dog1.speak(); // this is how we create the anonymous classes
        // class that doenot have a name and cannot be reused

    }
}
