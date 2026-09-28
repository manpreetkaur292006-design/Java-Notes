import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (pplaceholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        // we send arguments to the parameters

        // example of generics

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("kiwi");

        // example - Box

        // here we have to specify the data type
        // similar to the array lists

        Box<String> box = new Box<>();

        // set item
        box.setItem("banana");
        // get item
        System.out.println(box.getItem());

        // our box class is compatible with different data types
        // lets take integer
        // similarly you can use double , boolean etc here

        Box<Integer> box1 = new Box<>();

        // set item
        box1.setItem(3);
        // get item
        System.out.println(box1.getItem());

        // example 2 = product

        Product<String,Double> product = new Product<>("apple",0.50);

        // get item
        System.out.println(product.getItem());
        // get price
        System.out.println(product.getPrice());

        // creating another product
        Product<String,Integer> product1 = new Product<>("ticket",15);
        System.out.println(product1.getItem()); // get item
        System.out.println(product1.getPrice());  // get price

    }
}
