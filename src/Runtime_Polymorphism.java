import java.util.Scanner;

public class Runtime_Polymorphism {
    public static void main(String[] args){

        // Runtime Polymorphism = When the method that gets executed is
        // decided at runtime based on the actual type of the object.
        // also known as "Dynamic Polymorphism".

//        Animal_2 animal2 = new Animal_2();
        // we will get an error message
        // animal is abstract that cannot be instantiated

        // lets make an animal object but not instantiate it
        // as we want the user to choose the type of animal he wants
        Animal_2 animal2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like a dog or a cat? (1=dog,2=cat) : ");
        int choice = scanner.nextInt();

        if(choice==1){
            animal2=new Dog_RP();
            animal2.speak();
        }
        else if(choice==2){
            animal2=new Cat_RP();
            animal2.speak();
        }
        // here the actual method we call is determined at runtime
        // based on the input of the user - we know that we have to run
        // the speak method but do not know which one
        // this is a runtime polymorphism

    }
}