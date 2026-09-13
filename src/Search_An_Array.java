import java.util.Scanner;

public class Search_An_Array {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Searching the elements in an array
        int[] numbers = {1,9,2,8,4,3,2};
        int target = 2;  // target value
        boolean isFound = false;

        String[] fruits = {"apple","orange","banana"};
        System.out.print("Enter a fruit to search for: ");
        String tar=scanner.nextLine();

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                System.out.println("Element found at index: "+i);
                isFound=true;
                break; // as we found what we want so we donot
                // need to continue the loop without any purpose
            }
        }

        if (!isFound){
            System.out.println("Element not found in the array");
        }

        // if we have array of string then to compare we will use
        // equals method in place of == because arrays are
        // of reference data type

        // target == fruits[i] will compare the memory index rather
        // then the values therefore we will use the equals() method

        boolean found = false;
        for(int j=0;j<fruits.length;j++){
            if(fruits[j].equals(tar)){
                System.out.println("Fruit found at index: "+j);
                found=true;
                break; // as we found what we want so we donot
                // need to continue the loop without any purpose
            }
        }

        if (!found){
            System.out.println("Element not found in the array");
        }

        scanner.close();

    }
}
