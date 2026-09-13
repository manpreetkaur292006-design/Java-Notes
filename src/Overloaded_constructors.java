public class Overloaded_constructors {
    public static void main(String[] args){

        // overloaded constructors = allow a class to have multiple
        // constructors with different parameters lists.
        // enable objects to be initialized in various ways.
        // (by passing varying number of arguments in it)

        // user - 1
        Users user1 = new Users("Manpreet");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        // user - 2
        Users user2 = new Users("Arvind","Arvind@gmail.com");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        // user - 3
        Users user3 = new Users("Mankirat","Mankirat@gmail.com",20);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        // user - 4 -- guest user
        Users user4 = new Users();
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
