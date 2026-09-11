import java.util.Scanner;

public class Enhanced_Switches {
    public static void main(String[] args){

        // ENHANCED SWITCHES

        // Enhanced Switch = A replacement to many else if statements
        //                  (Java14 feature)

        // switch - a switch is a replacement to use many if else statements

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        // example of multiple if statements
        // here we have alot of redundancies and multiple if - else statements
        // this code can be more efficient

        if (day.equals("Monday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Tuesday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Wednesday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Thursday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Friday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Saturday")){
            System.out.println("It is a weekend");
        }
        else if (day.equals("Sunday")){
            System.out.println("It is a weekend");
        }
        else{
            System.out.println(day+" is not a day");
        }

        // and the improvement would be using the enhanced switches
        // -> : arrow operator : means do something

        switch (day){
            // cases are like if else statements
            case "Monday" -> System.out.println("It is a weekday😶");
            case "Tuesday" -> System.out.println("It is a weekday😶");
            case "Wednesday" -> System.out.println("It is a weekday😶");
            case "Thursday" -> System.out.println("It is a weekday😶");
            case "Friday" -> System.out.println("It is a weekday😶");
            case "Saturday" -> System.out.println("It is a weekend😊");
            case "Sunday" -> System.out.println("It is a weekdend😊");
            default -> System.out.println(day+" is not a day");  // like else statement
        }

        // we are outputting the same output for weekdays so we have to shorten that
        // we can use comma here and write the above code like this
        switch (day){
            // cases are like if else statements
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is a weekday😶");
            case "Saturday","Sunday" -> System.out.println("It is a weekdend😊");
            default -> System.out.println(day+" is not a day");  // like else statement
        }

        scanner.close();

    }
}
