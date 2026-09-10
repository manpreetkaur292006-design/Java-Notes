import java.util.Scanner;

public class If_States {
    public static void main(String[] args){

        // If Statements = performs a block of code if its condition is true

        Scanner scanner=new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name=scanner.nextLine();

        System.out.println("Enter your age: ");
        age=scanner.nextInt();

        System.out.println("Are you a student(true/false): ");
        isStudent=scanner.nextBoolean();


        // GROUP-1 : For name

        if (name.isEmpty()){  // name=="" - name.isEmpty()
            System.out.println("You didn't enter your name! 😡");
        }

        else{
            System.out.println("Hello "+name+"!😊");
        }


        // GROUP-2 : For age

        if (age>=65){
            System.out.println("You are a Senior!👴");
        }

        else if (age>=18){  // (age>=65) - here this will not work as it is above 25 and that executed first
            // so you have to take care of the positioning of the if else also
            System.out.println("You are an adult!👨‍🦰");
        }

        else if(age<0) {
            System.out.println("You haven't been born yet!😇");
        }

        else if(age==0) {  // "==" : comparison operator or "=" : assignment operator
            System.out.println("You are a baby!👶");
        }

        else{
            System.out.println("You are a child!👧");
        }


        // GROUP-3 : For isStudent

        if(isStudent){ // isStudent == true : isStudent
            System.out.println("You are a Student!🏫");
        }

        else{
            System.out.println("You are not a Student!🏢");
        }

        scanner.close();
    }
}
