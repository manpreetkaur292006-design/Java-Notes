import java.util.Scanner;

public class User_Input_In_Array {
    public static void main(String[] args){

        // enter a user input into an array

        // before adding the values to the array
        // our compiler needs the length of the array beforhand

//        String[] foods = {"pizza","taco","hamburger"};
        // the size of the above array is three elements

        // to create an empty array
        String[] a = {};
        System.out.println(a.length);

        // here the size of the array is fixed as zero
        // and that cannot be modified afterwards

        // before assigning values we must specify the size of the
        // array even if it is empty to get rid of the exceptions and the errors

        String[] foods = new String[3];

        // here we have created an empty array of strings
        // that can store 3 string elements in it

        foods[0]="pizza";
        foods[1]="taco";
        foods[2]="burger";

        System.out.println(foods.length);

        for (String food : foods){
            System.out.print(food+" ");
        }

        System.out.println();

        // now we will modify the above code in such a
        // way so that the user can input the value
        Scanner scanner = new Scanner(System.in);

        String[] fruits;
        int size;

        System.out.print("What number of fruits do you want: ");
        size=scanner.nextInt();
        scanner.nextLine(); // clear the scanner

        fruits= new String[size];

        for (int i=0; i<size ; i++){
            System.out.print("Enter a fruit: ");
            fruits[i]=scanner.nextLine();
        }

        for (String fruit : fruits){
            System.out.print(fruit+" ");
        }

        // in summary to enter the values from the user in the array
        // we need to create a empty array of the particular size and
        // we also have to specify that size also

        scanner.close();

    }
}
