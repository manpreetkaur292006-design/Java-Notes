// this file is made for the implementation of generics in java

public class Box<Thing> { // <T> => <Thing>

    // here we donot know what type of datatype does and item
    // have like string, int etc so we have taken <T> here as <Thing>

    Thing item;

    // putting things in the box
    public void setItem(Thing item){
        this.item=item;
    }

    // getting things from the box
    public Thing getItem(){
        return this.item;
    }

}
