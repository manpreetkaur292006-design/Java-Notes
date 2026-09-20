import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args){

        // Exception = An event that interrupts the normal flow of a program
        // (Dividing by zero, file not found, mismatch input type)
        // surround any dangerous code with a try{} block
        // try{}, catch{}, finally{}

//        System.out.println(1/0); // this will cause an exception
        // that is Arithmetic exception

        // gracefully handling these exceptions
        try{
            System.out.println(1/0);  // dangerous code in the try block
        }catch (ArithmeticException e){ // specify the type of expetion that we are handling
            // e is the abbrivation of ArithmeticException
            // you can add multiple catch blocks for specific type of exceptions
            System.out.println("YOU CANNOT DIVIDE BY ZERO !");
        }

        // DEMOSTRATION
        // using try with resources - by using this java will automatically close those resources
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); // local vairable
            System.out.println(number);
        } catch (InputMismatchException e) { // when we are handling specific types of exceptions
            System.out.println("That wasn't a number !");
        } catch (ArithmeticException e) {
            System.out.println("YOU CANNOT DIVIDE BY ZERO !");
        } catch (Exception e) { // catching all the types of exceptions
            // for SAFETY NET
            System.out.println("Something went wrong");
        } finally { // this will always execute
            System.out.println("This always executes"); // for testing we added this line
        }

        // finally is more useful when we open the file using try block
        // and then when you are done working with that file then
        // finally close that file in the end

        // finally is mainly used to do cleanup like closing the scanner

        // try any dangerous code , catch any exceptions and optionally
        // finally we do any resource cleanup

    }
}
