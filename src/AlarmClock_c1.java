// this is class 1 to implement the alarm clock project

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock_c1 implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock_c1(LocalTime alarmTime, String filePath, Scanner scanner){
        this.alarmTime=alarmTime;
        this.filePath=filePath;
        this.scanner=scanner;

        // here we have imported the same scanner that is used
        // in the main file of the project as if we have created two different scanners
        // then when we close one scanner it will close all the scanner due to system.in
        // therefore we are using the same scanner here that we have used in the main file
        // and we have not closed it in the main java file

    }

    @Override
    public void run(){
        // checking if the time now is before the setted alarm
        // then we will keep sleeping

        while (LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                int hours = now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();

                System.out.printf("\r%02d:%02d:%02d",hours,minutes,seconds);
                // "\r" - this is for carriage return it will move the cursor back to the begining
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        System.out.println("\nAlarm ringssss !!");

        // producing the beep sound in java
//        Toolkit.getDefaultToolkit().beep();

        // calling the playSound method to listen the alarm sound
        playSound(filePath);
    }

    // playing audio method
    private void playSound(String filePath){

        File audioFile = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("Press Enter to stop the alarm: ");
            scanner.nextLine();
            clip.stop();

            scanner.close();

        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file format is not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
        catch (IOException e){  // safety net
            System.out.println("Error reading the audio file");
        }

    }

}
