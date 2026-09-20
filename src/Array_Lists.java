import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_Lists {
    public static void main(String[] args){

        // ArrayList = A resizeable array that stores objects (autoboxing).
        // Arrays are fixed in size, but ArrayLists can change.

        // <> - diamond operator - helps deal with generics
        // <> in this we will specify that what type of object
        // we will store in the array list
        ArrayList<Integer> list = new ArrayList<>();
        // follow this method to create an array list with the integer values

        list.add(3);  // add() method to add the element
        list.add(1);
        list.add(2);

        System.out.println(list); // [3, 1, 2]

        // double array list
        ArrayList<Double> list2 = new ArrayList<>();

        list2.add(3.14);
        list2.add(1.99);
        list2.add(2.01);

        System.out.println(list2);

        // string array list
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("PineApple");

        System.out.println(fruits);
        // remove the elements - by index
        fruits.remove(0);
        System.out.println(fruits);

        // set method
        fruits.set(0,"Pear");  // setting the element at index 0 as pear
        System.out.println(fruits);

        // get method - to get an element at an certain index
        System.out.println(fruits.get(2));

        // size of the array list
        System.out.println(fruits.size());

        // sorting the array list
        Collections.sort(fruits); // we need to import this class
        System.out.println(fruits);

        // using the enhanced for loop to iterate all the elements in the array list
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        // you can use primitives in the array list
        // here by using autoboxing (where we are specifying the type
        // String etc <> in this)

    }
}
