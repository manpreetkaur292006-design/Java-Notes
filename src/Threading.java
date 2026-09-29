import java.util.Scanner;

public class Threading {
    public static void main(String[] args){

        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time - consuming operations
        //             (File I/O, network communications, or any background tasks)

        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        // demonstration

        Scanner scanner = new Scanner(System.in);

        System.out.println("You have ten seconds to enter your name: ");

        MyRunnable myRunnable = new MyRunnable(); // creating the object
        Thread thread = new Thread(myRunnable); // creating new thread
        thread.setDaemon(true); // this will end as soon as out mian thread is finishes (Damon thread)
        thread.start(); // starting the thread

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        // if your main thread is done then you can end all other threads
        // but you want to add those threads to be what is known as Damon threads
        // this will end when the main thread is over

        scanner.close();

    }
}
