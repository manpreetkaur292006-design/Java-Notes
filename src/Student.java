// this file is made for the implementation of the
// constructors in java

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // setting up a new constructor - as shown below
    // we will automatically call the constructor (behind the scene)
    // when we instantiate an object of that class

    // we can pass the arguments here
    // these parameters name need not to be same as of the attribute name
    Student(String a,int b,double c){
        this.name = a;  // assigning the values to the variable
        this.age = b;
        this.gpa = c;
        this.isEnrolled=true; // we donot necessary to pass an argument for this
        // a = name
        // b = age
        // c = gpa
    }

    // this keyword refers to the object that you are currently working with
    // like - in case of student1 this means that student1.name = name

    void study(){
        System.out.println(this.name+" is studying!");
    }

}
