public class Aggregation {
    public static void main(String[] args){

        // Aggregation = Represents a "has-a" relationship between objects.
        // One object contains another object as part of its structure,
        // but the contained object/s can exist independently.

        Book book1 = new Book("The Fellow of the Ring",423);
        Book book2 = new Book("The Two Towers",352);
        Book book3 = new Book("The Return of the King",416);

        System.out.println(book1.displayInfo());
        System.out.println(book2.displayInfo());
        System.out.println(book3.displayInfo());

        // creating a book object array
        Book[] books = {book1,book2,book3};

        // printing all the books
        for (Book book : books){
            System.out.println(book.displayInfo());
        }

        // creating a library object
        Library library = new Library("NYC Public library",1897,books);
        // this is aggregation -> library object has book objects
        library.displayInfo();

        // there is another concept of composition - with aggregation if you want to
        // delete the library class - then the book objects can exist independently
        // which is the key difference as compared to composition that will be covered later
    }
}
