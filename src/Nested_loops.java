import java.util.Scanner;

public class Nested_loops {
    public static void main(String[] args){

        // nested loop = a loop inside another loop
        // used often with matrices or DSA

        for (int i=1;i<=9;i++){
            System.out.print(i+" ");  // printing all the numbers in a single line
        }
        System.out.println();

        for (int i=1;i<=9;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i=1;i<=9;i++){
            System.out.print(i+" ");
        }

        // the above code is repeating again and again
        // so we will use nested for loop for ths

        System.out.println("\nOther method");

        for (int i =1;i<=3;i++){
            for (int j=1;j<=9;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // this is how we removed the code redundancy
        // for the above code

        // NESTED LOOP MINI PROJECT

        Scanner scanner = new Scanner(System.in);

        int rows;
        int cols;
        char symbol;

        System.out.println("Enter the number of rows: ");
        rows=scanner.nextInt();

        System.out.println("Enter the number of cols: ");
        cols=scanner.nextInt();

        System.out.println("Enter the symbol to use: ");
        symbol=scanner.next().charAt(0);

        for (int i=0; i<rows ; i++){
            for (int j=0; j<cols ;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();

    }
}
