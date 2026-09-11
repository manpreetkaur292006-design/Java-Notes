public class Ternary_Operator {
    public static void main(String[] args){

        // TERNARY OPERATOR

        // ternary operator (?) = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;
        // its a simpler version of the if-else statements

        int score = 70;

        // using if-else statement
        if(score>=60){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        // using the ternary operator
        // its an alternative of if-else statement and it is
        // simpler in many cases to use this
        String passOrFail=(score>=60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        // OTHER EXAMPLES

        // number if even or odd
        int number = 3;
        String evenOrOdd = (number%2==0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        // time of the day (AM or PM)
        int hours = 13;
        String timeOfDay = (hours>=12) ? "PM" : "AM";
        System.out.println(timeOfDay);

        // checking the text rate based on the income
        int income = 60000;
        double taxRate = (income>=40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
