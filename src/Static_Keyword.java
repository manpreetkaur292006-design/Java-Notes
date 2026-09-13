public class Static_Keyword {
    public static void main(String[] args){

        // static = makes a variable or method belong to the class
        // rather than to any specific object.
        // commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Shivani");
        Friend friend2 = new Friend("Bhavneet");
        Friend friend3 = new Friend("Simran");

        System.out.println(friend1.name);
        System.out.println(friend2.numOfFriends);

        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends);

        System.out.println(friend3.name);
        System.out.println(friend3.numOfFriends);

        // suggestion : when accessing a static variable it is
        // best to do so through the class itslef
        System.out.println(Friend.numOfFriends);

        // calling the static method
        Friend.showFriends();

        // another place where we see the static methods is through the math class
        Math.round(3.99);
        // round is a utility method and we access it through the class name math
        // we donot need to create the math object such as (Math math = new Math();)
        // we can access it through the name of the class

    }

}
