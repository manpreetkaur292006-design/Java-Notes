public class Overloaded_methods {
    public static void main(String[] args){

        // OVERLOADED METHODS
        // methods that share that same name, but different parameters
        // signature = name + parameters

        // add two numbers
        System.out.println(add(1,2));

        // what if we want to add three numbers
        // we will get an error - solution is to create another method add
        // that take three arguments but the name remained same
        // these two methods are the overloaded methods (share the same name but have
        // different parameters)

        // add three numbers
        System.out.println(add(1,2,3));

        // add four numbers
        System.out.println(add(1,2,3,4));

        // baking pizza
        // one argument
        String pizza=bakePizza("flat bread");
        System.out.println(pizza);

        // two argument
        String pizzas=bakePizza("flat bread","mozzarella");
        System.out.println(pizzas);

        // three argument
        String pizzast=bakePizza("flat bread","mozzarella","pepperoni");
        System.out.println(pizzast);

    }

    // method to add the two numbers
    static double add(double a, double b){
        return a+b;
    }

    // method to add the three numbers
    static double add(double a, double b, double c){
        return a+b+c;
    }

    // methods can have the same name but they should have different
    // parameters in that case

    // method to add the four numbers
    static double add(double a, double b, double c, double d){
        return a+b+c+d;
    }

    // baking a pizza function
    // with one parameter
    static String bakePizza(String bread){
        return bread+" pizza";
    }

    // with two parameters
    static String bakePizza(String bread,String cheese){
        return cheese+" "+bread+" pizza";
    }

    // with three parameters
    static String bakePizza(String bread,String cheese, String topping){
        return topping+" "+cheese+" "+bread+" pizza";
    }

}
