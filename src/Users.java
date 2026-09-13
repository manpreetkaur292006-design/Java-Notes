// this file is made to do the illustrations of the
// overloaded constructors in java

public class Users {

    String username;
    String email;
    int age;

    // what if someone wants to create the user
    // object just with the username

    Users(String username){
        this.username=username;
        // here both the following objects are
        // optional to provude as we have setted their
        // default values
        this.email="Not Provided";
        this.age=0;
    }

    // what if we have user that have an email
    // then we will create another constructor with same name
    // this is very similar to the method overloading
    Users(String username, String email){
        this.username=username;
        this.email=email;
        this.age=0;
    }

    // accepting all the three arguments
    Users(String username, String email, int age){
        this.username=username;
        this.email=email;
        this.age=age;
    }

    // setting an constructor that takes no arguments
    Users(){
        this.username="Guest";
        this.email="Not Provided";
        this.age=0;
    }

}
