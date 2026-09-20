// the main purpose of this file is to demonstrate aggrigation

// this object will contain the array of the book objects
// because library contains books
public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name=name;
        this.year=year;
        this.books=books;
    }

    void displayInfo(){
        System.out.println("The "+this.year+" "+this.name);
        System.out.println("Books Available: ");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }

}
