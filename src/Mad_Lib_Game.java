import java.util.Scanner;
public class Mad_Lib_Game {
    public static void main(String[] args){
    // CREATING A MAD LIBS GAME
        // MAD LIBS GAME - it is a game that where you have to story it and
        // the user have to fill it with the different words and then we get a
        // very funny resultant story according to the words inputed by the user

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective (description of something) : ");
        adjective1 = scanner.nextLine();

        System.out.println("Enter a noun (animal or a person name) : ");
        noun1 = scanner.nextLine();

        System.out.println("Enter an adjective (description of something) : ");
        adjective2 = scanner.nextLine();

        System.out.println("Enter an verb ending with -ing (action) : ");
        verb1 = scanner.nextLine();

        System.out.println("Enter an adjective (description of something) : ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a "+adjective1+" zoo.");
        System.out.println("In an exhibit, I saw a "+noun1+".");
        System.out.println(noun1+" was "+adjective2+" and "+verb1+" !");
        System.out.println("I was "+adjective3+"!");

        scanner.close();

    }
}
