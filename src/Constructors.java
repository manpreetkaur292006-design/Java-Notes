public class Constructors {
    public static void main(String[] args){

        // constructor = A special method to initialize objects
        // you can pass arguments to a constructor
        // and set up initial values

        // creating multiple student objects - with arguments

        Student student1 = new Student("Manpreet",20,9.91);
        Student student2 = new Student("Arvind",18,8.0);
        Student student3 = new Student("Mankirat",20,8.9);

        // student - 1
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        // student - 2
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        // student - 3
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();

    }
}
