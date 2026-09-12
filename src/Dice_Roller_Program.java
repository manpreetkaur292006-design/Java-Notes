import java.util.Random;
import java.util.Scanner;

public class Dice_Roller_Program {
    public static void main(String[] args){

        // DICE ROLLER PROGRAM

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total=0;

        // GET THE NUMBER OF DICE FROM THE USER
        System.out.print("Enter the number of dice to roll: ");
        numOfDice=scanner.nextInt();

        // CHECK IF THE NUMBER OF DICE > 0
        if(numOfDice>0){

            // ROLL ALL THE DICE
            for (int i=0; i<numOfDice; i++){
                int roll = random.nextInt(1,7);
                // CALLING THE DICE ROLL FUNCTION
                printDie(roll);
                System.out.println("You rolled: "+roll);
                // GET THE TOTAL
                total+=roll;
            }
            System.out.println("Total: "+total);

        }
        else{
            System.out.println("Number of dice must be greater than zero");
        }


        scanner.close();
    }

    // DISPLAY THE ASCII ART OF THE DICE

    //  to get the bullet point symbol press windows + r and type char map
    //  and search for it and select and copy it
    static void printDie(int roll){

        String dice1 = """
                  -------
                 |       |
                 |   •   | 
                 |       |
                  -------
                """;  // multi lined string

        String dice2 = """
                  -------
                 | •     |
                 |       | 
                 |     • |
                  -------
                """;

        String dice3 = """
                  -------
                 | •     |
                 |   •   | 
                 |     • |
                  -------
                """;

        String dice4 = """
                  -------
                 | •   • |
                 |       | 
                 | •   • |
                  -------
                """;

        String dice5 = """
                  -------
                 | •   • |
                 |   •   | 
                 | •   • |
                  -------
                """;

        String dice6 = """
                  -------
                 | •   • |
                 | •   • | 
                 | •   • |
                  -------
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }

    }
}