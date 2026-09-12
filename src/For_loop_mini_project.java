import java.util.Scanner;

public class For_loop_mini_project {
    public static void main(String[] args) throws InterruptedException{

        // Countdown simulator

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to count down from: ");
        int start = scanner.nextInt();

        for (int i = start; i>0 ; i--){
            System.out.println(i);
            Thread.sleep(1000); // pass millisecond
            // how much time you want this to sleep
            // this is a part of the advanced java
        }

        System.out.println("Happy Birthday!!");
        // throws InterruptedException :
        // This exception typically occurs when a thread running the method is
        // interrupted while it is sleeping , waiting, or otherwise paused in its execution

        scanner.close();

    }
}
