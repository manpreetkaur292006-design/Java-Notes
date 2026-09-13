// this file is made for the illustration of
// the super keyword in java

// this will inherit from the person class

public class Employee extends Person{

    int salary;

    Employee(String first, String last, int salary){
        super(first,last);  // inherited from person => Person(first,last)
        this.salary=salary;
    }

    void showSalary(){
        System.out.println(this.first+"'s salary is : $ "+this.salary);
    }

}
