import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Files {
    public static void main(String[] args){

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader : Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        // buffer reader cannot read the file by itself it acts as a middle man
        // between the program and the file system - it help us read files more efficiently
        // and the file reader is what that actually reads the file

        String filePath = "C:\\Users\\MANPREET KAUR\\IdeaProjects\\MyFirstProject\\src\\read-test.txt";

        // buffered reader -
        // this needs a reader object as an argument that is why
        // we are combining it with the file reader

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            // reading file line by line

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }

        catch (FileNotFoundException e){
            System.out.println("Could not locate the file");
        }

        catch (IOException e){  // catches all other exception works as a safety net
            System.out.println("Something went wrong");
        }

    }
}
