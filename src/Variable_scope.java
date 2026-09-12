public class Variable_scope {

    static int x=3; // class scope - in the class variable_scope
    // class vairable is decalared in the class not in any of the following methods
    // we can access the class variable inside the both functions created below

    public static void main(String[] args) {

        // variable scope = where a variable can be accessed

        // local and class scopes
        // inside of the method you craete a variable called local scope

        int x = 1; // local
        System.out.println(x);

        System.out.println("Do something methods calling");
        doSomething();

        // when we have local variables in the methods having same name as the class
        // variables then java will print the local variable first as it prefers the
        // local variable over the global in this case
    }

    static void doSomething(){
        // inside other methods you can create the variables with the same name
        int x=2;  // local
        System.out.println(x);
    }

}
