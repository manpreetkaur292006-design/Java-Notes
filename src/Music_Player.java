import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Music_Player {
    public static void main(String[] args){

        // How to PLAY AUDIO with Java (.wav, .au, .aiff)

        // it is not compatible with mp3 file but we can
        // convert then into .wav files easily online

        // for mp3 we need external java module like fx

        String filePath = "sample-audio.wav";
        File file = new File(filePath);

        // if we use the try with resources then it will automatically close
        // that audio object when we are done working with it - you donot need the finally block
        // same for the scanner

        // we can use the try with resources if an object implements the auto closable interface
        // both sanner and audio one do and clip doesnot so we just kept it inside the try block
        try(Scanner scanner = new Scanner(System.in) ; AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

           // creating audio input stream object
            Clip clip = AudioSystem.getClip();
            // clip is like a music or sound player
            // allows us to load an audio file and let you play,pause and
            // reset that audio file - so it gives you some controls
            clip.open(audioStream);

            // playing the audio
//            clip.start();
            // when we simply write this - this just jumped to the finally
            // block just after start and the whole audio is not played

            // so we will create the prompt for the user to
            // play,pause and restart

            String response="";
            while(!response.equals("Q")){
                System.out.println("P = play");
                System.out.println("S = stop");
                System.out.println("R = reset");
                System.out.println("Q = quit");

                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0); // reset
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                }

            }

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate the file");
        }
        catch (LineUnavailableException e) {
            // if any other resource is trying to access that audio
            // or if it is unplayable for some reason - we will come up with this exception
            System.out.println("Unable to access audio resource");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch (IOException e){
            System.out.println("Something went Wrong");
        }
        finally {
            System.out.println("Bye!!");
        }

    }
}