import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors_Game {
    public static void main(String[] args){

        // ROCK-PAPER-SCISSORS GAME

        // DECLARE VARIABLES

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        // DO - WHILE LOOP FOR REPEATED ITERATION TILL THE USER WANT TO PLAY

        do{
            // GET A CHOICE FROM THE USER

            System.out.print("Enter your move (rock,paper,scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice!");
                continue;
            }

            // GET RANDOM CHOICE FOR THE COMPUTER

            computerChoice = choices[random.nextInt(3)];
            // return a random number between 0 and 2
            System.out.println("Computer Choice: " + computerChoice);

            // CHECK WIN CONDITIONS

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            }
            // here we have condensed the three else if statements in to the one
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // ASK TO PLAY AGAIN ?

            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        // GOOD BYE MESSAGE

        System.out.println("Thanks for playing!");

        scanner.close();

    }
}
