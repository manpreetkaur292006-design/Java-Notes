public class Super_Keyword {
    public static void main(String[] args){

        // super = Refers to the parent class (subclass <- superclass)
        // used in constructors and method overriding
        // calls the parent constructor to initialize attributes

        // subclass means child class and superclass means parent class

        Person person = new Person("Manpreet","Kaur");
        Student_s student_s = new Student_s("Arvind","Singh",8.0);
        Employee employee = new Employee("Avtar","Kaur",50000);

        person.showName();
        student_s.showName();

        student_s.showGPA();

        employee.showSalary();

        // since the constructor of the parent of person requires a
        // first and last name any children object that we create we
        // have to call the constructor of the parent and pass those
        // arguments to satify java
        // if the parent doesnot need first and last then we also need not
        // to use the super keyword and pass that in the child classes

    }
}
