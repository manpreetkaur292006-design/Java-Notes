// this file is made for the illustration of
// the super keyword in java

// this is the superclass (parent)

public class Person {

    String first;
    String last;

    Person(String first, String last){
        this.first=first;
        this.last=last;
    }

    void showName(){
        System.out.println(this.first+" "+this.last);
    }

}
