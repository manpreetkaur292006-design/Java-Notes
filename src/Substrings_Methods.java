import java.util.Scanner;

public class Substrings_Methods {
    public static void main(String[] args){

        // .substring() = A method used to extract a portion of a string
        //                  string.substring(start,end) - syntax
        // this method creates a new string based on the positioning of the indices
        // we can create a new string from the portions of the original strings

        Scanner scanner=new Scanner(System.in);

        String email;

        System.out.println("Enter Your email: ");
        email=scanner.nextLine();

        // checking whether the email is valid or not

        // if valid then this block of code will run
        if (email.contains("@")){
            // getting the user name
            String userName=email.substring(0,11);
            System.out.println(userName);

            // getting the domain
            String domain=email.substring(12,21);
            System.out.println(domain);

            // work same as the above statement
            String domain2=email.substring(12);
            System.out.println(domain2);

            // to make this program more flexible we can determine the indexes form the other functions

            // getting the username by another method
            String userName2=email.substring(0,email.indexOf("@"));
            System.out.println(userName2);

            // getting the domain by another method
            String domain3=email.substring(email.indexOf("@")+1);
            System.out.println(domain3);
        }

        // otherwise this will run
        else{
            System.out.println("Emails must contain @");
        }

        scanner.close();

    }
}
