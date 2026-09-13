// this file is made to illustrate the static keywords in java

public class Friend {

    // each friend object has the copy of the number of
    // friends variable - we are incrementing each copy of
    // the number of friends by 1 same thing applies to friend 2
    // what if we want to keep the track of the total number of
    // friends created and store within one variable ??
    // there is a way to do that using the static modifier

    String name;
    // therefore we have written static in from of this
    // now all the friend will be sharing a one variable
    // rather than using its copy
    static int numOfFriends=0;  // all objects have the access to this

    Friend(String name){
        this.name=name;
        numOfFriends++;
    }

    // creating a static method
    static void showFriends(){
        System.out.println("You have "+numOfFriends+" total friends");
        // when you are working with the static attributes
        // you donot need this so in place of this.numOfFriends
        // we are using just numOfFriends
    }

}
