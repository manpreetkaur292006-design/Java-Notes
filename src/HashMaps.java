import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap <Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        // putting things in the hash maps
        map.put("apple",0.50);
        map.put("orange",0.75);
        map.put("banana",0.25);
        map.put("coconut",1.00);

        System.out.println(map);
        // output = {orange=0.75, banana=0.25, apple=0.5, coconut=1.0}

        // keys have to be unique in the hash maps
        // if we write the following line
        map.put("orange",75.0);

        // then the value will be over written as shown below
        System.out.println(map);
        // output = {orange=75.0, banana=0.25, apple=0.5, coconut=1.0}

        // remove elements - using key
        map.remove("apple");
        System.out.println(map);
        // {orange=75.0, banana=0.25, coconut=1.0}

        // to get the value associated with the key we can use the get method
        System.out.println(map.get("orange"));
        // output = 75.0

        // similarly we can access other values

        // checking whether the key or value exists
        System.out.println(map.containsKey("orange"));
        System.out.println(map.containsKey("apple"));

        if (map.containsKey("orange")){
            System.out.println(map.get("orange"));
        }else{
            System.out.println("Key not found");
        }

        // checking whether the map contains a particular value

        System.out.println(map.containsValue(1.00));  // coconut = 1.00
        System.out.println(map.containsValue(1));  // this will return false as this is integer

        // and the coconut have price in double data type

        // returning the size of the map
        System.out.println(map.size());

        // looping all the key values pairs and printing the results
        // map.keySet() - this will return all the keys within the map
        // and it is iterable so we can use it with the loops

        for (String key : map.keySet()){
            System.out.println(key+ " : $ " +map.get(key));
        }

        // by using the enchnaced for loops
        // we can customize the output as we want

        // you can also use the printf also to display
        // the two decimal points etc as per the needs
        // but i have kept it simple as possible for learning purpose
    }
}
