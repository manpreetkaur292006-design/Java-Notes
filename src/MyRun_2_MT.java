// this file is created to implement multi threading in java

public class MyRun_2_MT implements Runnable{

    private final String text;

    MyRun_2_MT(String text){
        this.text=text;
    }

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName()+" "+i);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        // Thread.currentThread().getName() - if we want to see the name of the
        // thread that which one is running then we will use this method
    }
}
