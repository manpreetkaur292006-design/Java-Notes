public class VarArgs {
    public static void main(String[] args){

        // varargs = variable arguments
        // varargs = allow a method to accept a varying number of arguments
        // makes methods more flexible, no need for overloaded methods
        // java will pack the arguments into an array
        // ...(ellipsis)

        // now in the add we can send the any number of arguments
        // all these will be packed into the array numbers
        System.out.println("sum");
        System.out.println(add(1,2,3,4));

        System.out.println("Average");
        System.out.println(average(1,2,3,4));

        // if we pass no arguments we will get (NaN as output)
        System.out.println(average());  // to tackle this we have returned zero
    }

    // creating one add method that accepts the varying arguments

    // here int...numbers means an array of integers named numbers
    // where all the arguments will be stored
    static int add(int...numbers){
        System.out.println(numbers);  // we will get the memory address of this array
        int sum = 0;
        for (int num : numbers){
            sum+=num;
        }
        return sum;
    }

    // method to find the average
    static double average(double...nums){
        double sum = 0;
        if (nums.length==0){
            return 0;
        }
        for (double num : nums){
            sum+=num;
        }
        return sum/ nums.length;
    }

    // this is the easier way to implement the things
    // without using the overloaded methods

}
