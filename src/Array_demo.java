import java.util.Arrays;

public class Array_demo {
    public static void main(String[] args){

        // ARRAY : a collection of values of the same data type
        // * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple","orange","banana","coconut"};
        // now we have an array of strings
        System.out.println(fruits);
        // we will get the memory address of the array
        // output : [Ljava.lang.String;@27716f4

        // arrays are in the category of the reference datatypes
        // therefore if we access the name of the array we will get the
        // memory address . each value within the array is known as the
        // element and to access each element of the array we have to indicate
        // its index number

        System.out.println(fruits[0]);  // print the first element of the array
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        // if we try to access that index that does not exist in the array then we
        // will get an exception that is similar to an error
        // that is the out of bound exception

        // changing the value at the given index
        fruits[0]="pineapple";
        System.out.println(fruits[0]);

        // length of an array
        // . - is the access modifier
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        // print all the elements in the array
        // using the for loop
        for (int i=0; i<numOfFruits; i++){
            System.out.print(fruits[i]+" ");
        }

        System.out.println();

        // enhanced for loop (for each loop) - will cycle once for each element within the array
        // the enhanced for loop simplifies the iterating through the collection like in array
        // the following statement means - for every fruit in my array of fruits do this
        // similar to python's : for fruit in fruits: statement
        for (String fruit : fruits){
            System.out.print(fruit+" ");
        }

        System.out.println();

        // sorting the array
        Arrays.sort(fruits);
        // this method will sort the elements in the array alphabetically
        // as shown below
        for (int i=0; i<numOfFruits; i++){
            System.out.print(fruits[i]+" ");
        }

        System.out.println();

        // fill method in the arrays
        // pass array and the value to fill in the whole array
        Arrays.fill(fruits,"kiwi");
        for (int i=0; i<numOfFruits; i++){
            System.out.print(fruits[i]+" ");
        }

        // array is the variable that can have multiple values in it

    }
}
