public class Math_Class {
    public static void main(String[] args){

        // MATH CLASS

        System.out.println("PI: "+Math.PI); // value of pi

        System.out.println("E: "+Math.E);  // exponential constant - euler's number

        double result;

        result=Math.pow(2,3);  // 2^3
        System.out.println("Power: "+result);

        result=Math.abs(-5);  // return a positive value of a negative number
        System.out.println("Absolute: "+result);

        result=Math.sqrt(9);  // square root of 9
        System.out.println("Square Root: "+result);

        result=Math.round(3.14); // round an integer to its nearest whole number
        System.out.println("Round Off: "+result);

        result=Math.ceil(3.14);  // round 3.14 to up mean = 4
        System.out.println("Ceil: "+result);

        result=Math.floor(3.99);  // round 3.14 to down mean = 3
        System.out.println("Floor: "+result);

        result=Math.max(10,20);  // return the greater number
        System.out.println("Max: "+result);

        result=Math.min(10,20);  // return the smaller number
        System.out.println("Min: "+result);

    }
}
