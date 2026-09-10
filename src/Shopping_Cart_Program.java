import java.util.Scanner;
public class Shopping_Cart_Program {
    public static void main(String[] args){
        // SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int qty;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy?: ");
        item=scanner.nextLine();

        System.out.println("What is the price for each?: ");
        price=scanner.nextDouble();

        System.out.println("How many would you like?: ");
        qty=scanner.nextInt();

        total = qty*price;

        System.out.println("\nYou have bought "+qty+" "+item+"/s");
        System.out.println("Your total is "+currency+total);

        scanner.close();
    }
}
