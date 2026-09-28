import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDown_Timer {
    public static void main(String[] args){

        // Java COUNTDOWN TIMER PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = response;

            @Override
            public void run(){

                System.out.println(count);
                count--;

                if (count<0){
                    System.out.println("Happy New Year!!");
                    timer.cancel();
                    // if we did not cancel the timer it will continue forever

                }
            }
        };

        timer.scheduleAtFixedRate(task,0,1000);
        // (task,delay,period) we have to pass these in the above method

    }
}
