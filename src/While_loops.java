import java.util.Scanner;

public class While_loops {
    public static void main(String[] args){

        // WHILE LOOPS = repeat some code forever
        // while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name="";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        // here if we did not enter the name even then
        // the following will work so we will use the while loop
        // in place of the if statement as shown above

        System.out.println("Hello "+name);

        // BE CAUTIOUS with the infinite loop
        // as shown below

//        while (1==1){
//            System.out.println("HELP! I'M STUCK IN A LOOP");
//        }

        // the above is the infinite loop and will run forever
        // until stopped manually

        // Another example of the infinite loop
        // as long as the input is not equal to "q" the loop
        // will run forever till then

        String response="";

        while (!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit: ");
            response=scanner.next().toUpperCase();
        }

        System.out.print("You have quit the game");


        // another example of while loop

        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        // if we type a number that is valid then we will not enter the
        // while loop and we skip over this
        // there is a variation of the while loop that is do-while loop
        // in which first we have to do some work and then run the while loop
        // condition after that

        while (age<0){
            System.out.println("Your age cannot be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are "+age+" years old");

        // convertion of above code in the do-while loop

        do{ // you always do this code at least one and then check the while condition
            System.out.println("Your age cannot be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }while (age<0);

        // another example

        int number=0;

        while (number<1||number>10){
            System.out.print("Enter a number between 1 - 10: ");
            number=scanner.nextInt();
        }

        System.out.println("You picked "+number);

        // convertion of the above code in the do while loop
        // this code will work similarly as the above code

        do{
            System.out.print("Enter a number between 1 - 10: ");
            number=scanner.nextInt();
        }while (number<1||number>10);

        System.out.println("You picked "+number);

        scanner.close();

    }
}
