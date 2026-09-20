// the main use of this file is to implement interfaces

public class Fishes implements Prey,Predator{

    @Override
    public void flee(){
        System.out.println("*The fish is swimming again*");
    }

    @Override
    public void hunt(){
        System.out.println("*The fish is hunting*");
    }

}
