import java.util.Locale;

public class String_Methods {
    public static void main(String[] args){

        // STRING METHODS

        String name = "Manpreet Kaur";

        // calculating the length of the string
        int length = name.length();
        System.out.println(length);

        // to get the character at the given index - index starting from 0
        char letter = name.charAt(0);
        System.out.println(letter);

        // finding an index of the given letter (gives the first occurence of the letter)
        int index = name.indexOf("a");
        System.out.println(index);

        // this will give the last occurence of the specified letter
        int lastIndex = name.lastIndexOf("a");
        System.out.println(lastIndex);

        // making all the letters to the upper case
        String UpperName=name.toUpperCase();
        System.out.println(UpperName);

        // making all the letters to the lower case
        String LowerName=name.toLowerCase();
        System.out.println(LowerName);

        // triming the leading and trailing white spaces
        name = "   Manpreet Kaur   ";
        System.out.println(name);

        name = name.trim();
        System.out.println(name);

        // replacing one character by other
        // like here we are replacing a's by o's
        name = name.replace("a","o");
        System.out.println(name);

        // methods that return the boolean values
        System.out.println(name.isEmpty());
        // checking is the string is empty what will be the output
        String emty="";
        System.out.println(emty.isEmpty());

        // implementing isEmpty in the if statements
        if(name.isEmpty()) {
            System.out.println("You name is empty");
        }
        else{
            System.out.println("Hello "+name);
        }

        // if our string contains a particular character
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name does not contain any spaces");
        }

        // to check if two strings are equal
        name="password";
        // equal method does not ignore the case sensitivity
        // password != Password here
        // to ignore this use equalsIgnoreCase() method
        if (name.equalsIgnoreCase("Password")){
            System.out.println("Your name can't be password");
        }else{
            System.out.println("Hello "+name );
        }

    }
}
