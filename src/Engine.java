// this file is made to implement composition in java

public class Engine {

    String type;

    // constructor
    Engine(String type){
        this.type=type;
    }

    // start engine method
    void start(){
        System.out.println("You start the "+this.type+" engine");
    }

}
