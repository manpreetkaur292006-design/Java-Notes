// why you need to learn Java :
// it is one of the top three popular languages
// it is extremely flexible and is used in web apps, games etc
// easy to find a job as a java developer
// (entry salary $70474 Glassdoor)

// computer languages is a spectrum between high level language
// (for humans) and computer only understand binary language that is
// low level languages (for computers)
// we write the source code that is written by the human beings and
// is compiled to (transform source code to machine code)
// to convert into obejct code that is understood by the machine code
// java have ".java" file extention

// in java we can compile the source by converting it into the bytecode
// that is cross platform (portable) and ends with a ".class" file extension
// you can send this bytecode to your friend and to convert this back into
// the java code they can use jvm to translate the bytecode to machine
// jvm is included with jdk
// jdk is acronym of the java development kit that inclued the development tools
// including jre that is the java runtime environment that have libraries and toolkits
// and this jre is have jvm that is java virtual machine that runs the programs

// IDE - integrated development environment software that help us write another software
// it provide us interface fro us to write code, check error ,compile and runcode
// you can either install eclipse or intellij idea IDE's

// in intellij to create project select new project and write the name of the project and
// select the latest version of the jdk and select the check box(add sample codes)
// and boom the project is created

// in the project folder go to source folder -> file -> java class -> main -> class -> will get Main.java
// shift + f10 to run the code or run the code by clicking on the button
// to run code in java we need main method

// to take user input then we need to import this see bottom for proper implementation
import java.util.Scanner;

// print hello world program
public class Main{
    // you need this method in order to run the program
    public static void main(String[] args){
        // this is my first java program
        System.out.print("Hello World"); // print statement
        System.out.print(" I like golgappe !\n"); // both the print statements will printed in the single line
        // to take this to new use the escape character \n or println
        System.out.println("It is really good"); // print line
    /* This
    is a
    multi
    line comment
     */

        // shortcut - sout and hit tab to get the print statement in short

        // variable in java
        // variable is the reuasable container for a value
        // a variable behaves as if it was the value it contains

        // these are of two types -
        // primitive = simple value stored directly in memory (stack)
        // reference = memory address (stack) that points to the (heap)

        // primitive VS reference
        // int          string
        // double       array
        // char         object
        // boolean

        // 2 steps to creating a variable
        // 1. declaration
        // 2. assignment

        // PRIMITIVE DATA TYPES
        int age=20; // declaration+assignment
        System.out.println(age);
        // lead to error as age is not initialized means value nahi define
        // ke uski bhale use decalare kar diya hai iske fix karne ke liye age = 12
        // kar sakte hai that is assignment of the value to variable a that was declared
        int year = 2026;
        System.out.println("This year is "+ year);
        int quantity = 1; // int can have integer values not decimal ones that leads to error
        System.out.println("The quantity of box is "+quantity);

        // Double data type - store decimal values
        double price = 19;
        double gpa = 9.91;
        double temp = -12.5;
        System.out.println("$ " + price);

        // char data type - single characters
        char grade = 'O';  // the value should be in single quotes only
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        // boolean - true or false
        boolean isStudent = true;
        // variable name is in camel case as if two words combine
        // it should be in camel case
        boolean forSale = false;
        boolean isOnline = true;
        System.out.println(isOnline);
        System.out.println(forSale);
        System.out.println(isStudent);

        // if-else statement - (do in future for detail)
        if (isStudent){  // isStudent == true can be replaced by this
            System.out.println("You are a student !");
        }else{
            System.out.println("You are not a student !");
        }

        // REFERENCE DATA TYPES

        // string - a series of characters, they have a reference data types
        String name = "Manpreet Kaur";
        // this is in double quotes and in char it is single
        System.out.println(name);

        // string concatination
        System.out.println("Hello "+name);
        System.out.println("My name is "+name+". I am "+age+" years old!");
        System.out.println("My gpa is :"+gpa);
        System.out.println("Your average letter grade is: "+grade);
        System.out.println("Combine variables : "+year+" "+name+" "+age);

        // if-else statements with string concatination
        String car="Mustang";
        if(forSale){
            System.out.println("There is a "+car+" Sale");
        }else{
            System.out.println("There is not a "+car+" sale");
        }

        // accepting user input in java
        // we will use scanner in java for taking that the user inputs
        //  A scanner is an object that allows us to accept the user input in java
        // to use scanner we need to import it see the top of the file for the import statement
        Scanner scanner = new Scanner(System.in);
        // Scanner is the class name and scanner is the object name
        // there is the difference in case here only
        // System.in - scanner object can read user input

        System.out.println("Enter your Name :");
        String fullname = scanner.nextLine();  // by this line user will be able to type a string as an input
        // in this user input spaces in the string are allowed
        // but if we write next() only then the spaces will not be allowed
        System.out.println("My name is :"+fullname);
        // other method
        System.out.print("Enter your full name :");
        String Fullname=scanner.next();
        System.out.println("NAme :"+Fullname);

        System.out.println("Enter your age : ");
        int ages = scanner.nextInt();
        System.out.println("You are "+ages+" years old !");
        // to integer there is the another method called "nextInt"

        // if you want to give a double value as an interger then there is another method
        // called a next double method of scanners
        System.out.println("What is your gps : ");
        double cgpa = scanner.nextDouble();
        System.out.println("My gpa is :"+cgpa);

        // for boolean values
        System.out.println("Are you are student? (true/false) :");
        boolean isStu = scanner.nextBoolean();
        System.out.println("Student : "+isStu);
        // using if-else in this
        if (isStu){
            System.out.println("You are enrolled as a student");
        }else{
            System.out.println("You are not enrolled as a student");
        }

        // COMMON ISSUES
        System.out.print("Enter your age: ");
        int a=scanner.nextInt();
        scanner.nextLine(); // to get rid of \n we used this
        System.out.println("Enter your favorite color: ");
        String color=scanner.nextLine();
        System.out.println("You are "+a+" years old");
        System.out.println("You like the color "+color);
        // output :
//        Enter your age: 32
//        Enter your favorite color:
//        You are 32 years old
//        You like the color
        // Explanation : when we entered the number 32 and hit enter there is another \n with that
                        // that is 32\n and this \n is taken as an input here for the color part
        // this is due to nextline method to get rid of that we can use the scanner and call the
        // scanner.nextline() function

        scanner.close(); // if you donot close scanner it can lead to unexpected behaviour
        // write this line in the end of the code to close it

    }
}
