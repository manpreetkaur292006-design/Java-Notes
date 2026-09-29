import java.util.Scanner;

public class ENums {
    public static void main(String[] args){

        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response); // this is an object
            System.out.println(day);
            System.out.println(day.getDayNumber());
            // it is helpful when we are working with switches
            // as it is faster than strings - like rather than adding "MONDAY" etc
            // we have used enums to make the code efficient

            // in the below code we can also write the numbers corresponding to the enum
            // constants but that is way less readable as a programmer so we are using their names

            // example
            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY,
                     PIZZADAY -> System.out.println("It is a weekend");
            }
        }
        catch (IllegalArgumentException e){ // if we enter something that is not in the
            // cases of the enums then this will lead to this exception
            // to handle that we have enclosed it in the try and except block
            System.out.println("Please enter a valid day!!");
        }
        scanner.close();

    }
}
