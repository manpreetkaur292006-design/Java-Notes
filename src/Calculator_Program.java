import java.util.Scanner;

public class Calculator_Program {
    public static void main(String[] args){

        // CALCULATOR PROGRAM

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;  // initializing the result
        boolean validOperation = true;  // this is made as we were getting output in case of
        // invalid operators also to fix that we defined this variable and used this to make
        // the code more optimized

        System.out.print("Enter the first number: ");
        num1=scanner.nextDouble();

        System.out.print("Enter an operator (+,-*,/,^): ");
        operator=scanner.next().charAt(0);  // to get the first character only

        System.out.print("Enter the second number: ");
        num2=scanner.nextDouble();

        switch (operator){
            case '+' -> result=num1+num2;
            case '-' -> result=num1-num2;
            case '*' -> result=num1*num2;
            case '/' -> {  // handled the division by zero this is leading to infinity
                if (num2==0){
                    System.out.println("Division by Zero not allowed");
                    validOperation=false;
                }
                else{
                    result=num1/num2;
                }
            }
            case '^' -> result=Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid Operator !");
                validOperation=false;
            }
        }

        // printing result if the user entered the valid operator
        if (validOperation){
            System.out.print(result);
        }
        // we don't need else as we already printed the message in
        // the default of the switch

        scanner.close();
    }
}
