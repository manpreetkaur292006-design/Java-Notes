public class Methods {
    public static void main(String[] args){

        // methods = a block of reusable code that is executed when called ()

        // what if we want to print the happy birthday song three times then we
        // need a method as if we print it three time then the code will be repeated
        // again and again just remember (DRY=donot repeat yourself)

        // if we want to use these vairables in the happy birthday method
        // then the happy birthday method is not aware about that what these
        // variables are - this will lead the error
        // methods are not fimiliar with the vairables within another methods

        String name = "Manpreet";
        int age= 20;

        // calling the method
        // to get this three times you just need to
        // call it three times

        happyBirthday(name,age);  // passing arguments
        happyBirthday(name,age);
        happyBirthday(name,age);

        // squaring a number
        double result=square(3);
        System.out.println(result);

        // cubing a number
        double cube=cube(3);
        System.out.println(cube);

        // printing the full name
        String fullName=GetFullName("Manpreet","Kaur");
        System.out.println(fullName);

        // age checker method
        int Uage = 20;
        if (userAgeCheck(Uage)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must ber 18+ to sign up!");
        }

    }

    // create a method outside the main method
    // we need static here as we are calling this method in the main
    // method that is static for the code to work when we call the function
    // and similarly we need void

    // just keep in mind these methods are unfamilier with the variables that are
    // declared in the other method

    // HAPPY BIRTHDAY SONG METHOD
    static void happyBirthday(String name, int age){  // passing parameter in the method
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n",name);
        System.out.printf("You are %d years old!\n",age);
        System.out.println("Happy Birthday to you!\n");
    }

    // arguments - we can send information from one method to another method
    // these are called as arguments

    // the names of the parameters can be different from the arguments
    // just keep in mind that the data type is correct and the order
    // in which you will recieve these areguments

    // when we are not returning anything then we use the key word void
    // and when we are returning something then we have to write the
    // data type of the value that we will return as in the following
    // example you can see that we are returning a double datatype that is
    // why we have used double in place of void

    // SQUARING A NUMBER
    static double square(double number){
        return number*number;
    }

    // CUBING A NUMBER
    static double cube(double number){
        return number*number*number;
    }

    // RETURNING THE FULL NAME FROM FIRST AND LAST NAME
    static String GetFullName(String first, String last){
        return first+" "+last;
    }

    // return keyword will return the value after the method ends , it will
    // return the value back to the place in which you called that method

    // method to varify the user age
    // USER AGE VERIFYING METHOD
    static boolean userAgeCheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }

}