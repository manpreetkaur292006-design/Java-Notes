// this file is made for the implementation of threading in java
public class MyRunnable implements Runnable{

    @Override
    public void run(){

        // any code you want to run in the separate thread you can add that in the run method

        for(int i=1; i<=10; i++){

            try{
                Thread.sleep(1000); // this refers to the main thread we are working with
                // our thread can be intruppted so we will use the try and catch block
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i==10){
                System.out.println("Time's Upp !!");
                System.exit(0); // exit the program prematurly
                // as we want to exit the program either when you write your name
                // or when you run out of time
            }

        }
    }

}
