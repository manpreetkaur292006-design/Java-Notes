public class MultiThreading {
    public static void main(String[] args){

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time - consuming operations

        // below we are trying to make a ping pong game
        Thread thread1 = new Thread(new MyRun_2_MT("PING")); // used anonymous runnable object
        Thread thread2 = new Thread(new MyRun_2_MT("PONG"));

        System.out.println("GAME START !");

        thread1.start(); // starting this method
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER !"); // this will not wait for thread1 and thread2 to finish
        // for that we will use join method
        // after that this line will wait for the above two threads to finish
        // and in the end we will get the desired output

    }
}
