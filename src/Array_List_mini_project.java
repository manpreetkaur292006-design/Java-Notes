import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_mini_project {
    public static void main(String[] argst){

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        // clear the input buffer
        scanner.nextLine();

        for(int i=1; i<=numOfFood; i++){
            System.out.print("Enter food number "+i+": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();

    }
}
