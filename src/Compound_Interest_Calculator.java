import java.util.Scanner;

public class Compound_Interest_Calculator {
    public static void main(String[] args){

        // COMPOUND INTEREST CALCULATOR

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal=scanner.nextDouble();

        System.out.print("Enter the Interest rate (in %): ");
        rate=scanner.nextDouble()/100;  // converting the percentage into number

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded=scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years=scanner.nextInt();

        // following is the formula to calculate the amount
        amount = principal * Math.pow(1+(rate/timesCompounded),timesCompounded*years);

        // used printf for ease
        System.out.printf("The amount after %d is: $%.2f",years,amount);

        scanner.close();

    }
}
