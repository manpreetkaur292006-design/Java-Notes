import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args){

        // TEMPERATURE CONVERTER

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp=scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit=scanner.next().toUpperCase();  // taking user input and converting it to upper case

        // ternary operation syntax = (condition) ? true : false

        newTemp=(unit.equals("C")) ? (temp-32)*5/9 : (temp*5/9)+32;

        System.out.printf("%.2f %s",newTemp,unit);
        // alt+0176 with on numlock to get degree symbol

        scanner.close();

    }
}
