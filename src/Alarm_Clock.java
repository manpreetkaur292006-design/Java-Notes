// this is the main alarm clock class

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Alarm_Clock {
    public static void main(String[] args){

        // JAVA ALARM CLOCK - FINAL JAVA PROJECT

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;

        // importing the sample audio
        String filePath = "sample-audio.wav";

        while(alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                // used to convert the time in particular format

                System.out.println("Alarm set for " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS format!!");
            }
        }

        // creating the object and adding the alarm time ( local time )
        AlarmClock_c1 alarmClock_c1 = new AlarmClock_c1(alarmTime,filePath, scanner);
        Thread alarmThread = new Thread(alarmClock_c1);

        // starting the thread
        // it is going to call the run method
        alarmThread.start();

    }
}
