import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Files {
    public static void main(String[] args) throws IOException {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        // file writter

        // if you donot specify the path of the file then it will automatically
        // added to the src folder
        // you can also write the file path like : "C:\\Users\\MANPREET KAUR\\OneDrive\\Desktop\\test.txt"
        // you have to use double slash as java takes a single forward slash as escape sequence

        // if you added the wrong file path then it will give an exception as java could not locate the
        // file and then the catch block will work and print the output

        String filePath = "C:\\Users\\MANPREET KAUR\\OneDrive\\Desktop\\test.txt";
        // we can store the path as a variable and use this for better organization
        // similarly we can do for the test that we want to write in the file
        String textContent = "I like Golgappe";

        String text = """
                Roses are Red
                Violets are Blue
                Yo Bro""";
        // you can also write this kind of the multi-line string

        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        // while handling exception it is best practise to cathc the specific types
        // of exceptions first
        catch (FileNotFoundException e){
            System.out.println("Could not locate the file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }

        // for writing file you need try and catch block always for the
        // exception handling part

    }
}
