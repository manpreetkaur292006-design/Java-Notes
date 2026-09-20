public class Wrapper_Classes {
    public static void main(String[] args){

        // Wrapper Classes = Allow primitive values (int, char, double, boolean)
        // to be used as objects. "Wrap them in an object"
        // Generally, don't wrap primitives unless you need an object.
        // Allows use of collections framework and static utility methods.

        // wrapping a primitive into an object (this method is depriciated
        // but good to know for understanding) - the modern approach is using a
        // technique called autoboxing

//        int a = 123;
// we can treat is as an object using a wrapper class

        Integer a = new Integer(123); // a is an object
        // we are passing the primitive data type int as an argument to
        // the integer class - so a is an object that have a primitive value 123

        // the above method is depriciated
        Double b = new Double(3.14);
        Character c = new Character('%');
        Boolean d = new Boolean(true);
        // these are all object (a,b,c,d)

        // modern way - Autoboxing
        // we are directly assigning these primitives into
        // an object using a wrapper class
        Integer a2 = 123;
        Double b2 = 3.14;
        Character c2 = '$';
        Boolean d2 = true;
        String e2 = "Pizza";
        // these all are the reference data type

        // to convert the wrapper class back into its primitive
        // the process is called unboxing
        int x = a2;  // unboxing
        double y = b2;
        char cc = c;
        boolean bb = d;

        // using wrapper classes to convert these primitive
        // data types into strings
        String s = Integer.toString(123);
        String t = Double.toString(3.14);
        String u = Character.toString('%');
        String v = Boolean.toString(false);

        String p = s+t+u+v;
        System.out.println(p);

        // to convert the string to the primitive data types
        // we have another method that is parsing
        int pp = Integer.parseInt("123");
        double q = Double.parseDouble("3.14");
        char r = "Pizza".charAt(0); // they donot have parse method
        // we can use char at for this
        boolean st = Boolean.parseBoolean("true");

        // printing all these - we will print these seperately
        // as they have different data type so they cannot be added as
        // done above
        System.out.println(pp);
        System.out.println(q);
        System.out.println(r);
        System.out.println(st);

        // some more examples of utility methods of wrapper class
        char letter = 'b';
        System.out.println(Character.isLetter(letter)); // return a boolean
        // useful for varifying user inputs
        char letter2 = '#';
        System.out.println(Character.isLetter(letter2));
        // is char in upper case or not - return a boolean output
        System.out.println(Character.isUpperCase(letter));

    }
}
