// this file is made for the illustration of
// the super keyword in java

// this is the child class of the parent class person

public class Student_s extends Person{

    double gpa;

    // any argument that the parent requires that we have to
    // send these arguments from the child constructor
    // that is using the super keyword that refers to the parent

    Student_s(String first,String last, double gpa){
        super(first,last);
        this.gpa=gpa;
    }

    void showGPA(){
        System.out.println(this.first+"'s GPA is: "+this.gpa);
    }

}
