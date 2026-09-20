// the main purpose of this file is to implement
// getters and setters

public class Car_GS {

    // by adding the word private before that we cannot access these variables
    private final String model;
    private String color;
    private int price;

    Car_GS(String model,String color, int price){
        this.model=model;
        this.color=color;
        this.price=price;
    }
    // with our car object these attributes are publicaly accessable

    // getter methods
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$"+this.price;
    }
    // you can also add the additional logic in the getter methods also
    // as we done in the get price method

    // setter methods
    // making the color and price changable / editable
    void setColor(String color){
        this.color=color;
    }
    void setPrice(int price){
        if(price<0){
            System.out.println("Price cannot be less than zero");
        }
        else{
        this.price=price;
        }
    }

    // if we want to make model to be writable
//    void setModel(String model){
//        this.model=model;
//    }
    // if you donot want a variable to be writable then you can
    // add the keyword final after the keyword private - this
    // adds an extra security

}
