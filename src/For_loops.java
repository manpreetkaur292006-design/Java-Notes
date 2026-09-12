import java.util.Scanner;

public class For_loops {
    public static void main(String[] args){

        // for loop = execute some code a CERTAIN amount of times
        // use for loop when you want to execute something a limited
        // amount of times

        // i - is being used as the counter in this loop also
        // known as the loop control variable
        // syntax - for (counter, condition , update the counter)
        // i.e (initialization, condition, update)
        for (int i=1 ; i<=10 ; i++ ){
            System.out.println(i+" GolGappe");
        }

        // decrementing in the loop
        for (int i=10 ; i>0 ; i--){
            System.out.println(i+" GolGappe");
        }

        // incrementing loop by 2
        for (int i=1 ; i<=10 ; i+=2 ){
            System.out.println(i+" GolGappe");
        }

        // another example
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i=1 ; i<=max ; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}
