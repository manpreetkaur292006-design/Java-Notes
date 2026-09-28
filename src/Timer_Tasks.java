import java.util.Timer;
import java.util.TimerTask;

public class Timer_Tasks {
    public static void main(String[] args){

        // Timer = Class that schedules tasks at specific times or periodically
        //         Useful for : sending notifications, schedules updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the TimerTask class to define your task
        //             Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 3;

            @Override
            public void run(){

                System.out.println("Hello!");
                count--;

                // stopping condition for the timer to stop
                if(count<=0){
                    System.out.println("Task completed !");
                    timer.cancel(); // close the timer after 3 times it is executed
                }
            }
        };

        // the following line perform the particular task first after 3sec and
        // with the interval of 1 sec each

        timer.schedule(task,3000,1000); // 1000 means 1 sec
        // after one sec we will get the output
        // after the delay of 3000 ms
        // after every second we will get the output

    }
}
