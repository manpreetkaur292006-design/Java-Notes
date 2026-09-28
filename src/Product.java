// this file is made for the implementation of generics in java

// U is the common convention for the second argument
// its U because it comes after T for third one it will V and so on

public class Product <T, U>{

    T item;
    U price;

    Product(T item, U price){
        this.item=item;
        this.price=price;
    }

    // get item
    public T getItem(){
        return this.item;
    }

    // get price
    public U getPrice(){
        return this.price;
    }

}
