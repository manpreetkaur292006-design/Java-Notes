import java.util.Random;

public class Random_Numbers {
    public static void main(String[] args){

        Random random = new Random();  // range of random -2 billion to 2 billion

        int number;

        number = random.nextInt(1,7);  // range from 1 to 7
        // i inclusive and 7 exclusive possible outputs [1,2,3,4,5,6]

        System.out.println(number);

        // using random on three numbers

        int num1;
        int num2;
        int num3;

        num1=random.nextInt(1,101);
        num2=random.nextInt(1,101);
        num3=random.nextInt(1,101);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // you can generate random doubles also

        double dnum;

        dnum=random.nextDouble(); // give random number between 0 and 1

        System.out.println(dnum);

        // you can also generate a boolean

        boolean isHead;

        isHead=random.nextBoolean();

        System.out.println(isHead);

        if(isHead){
            System.out.println("HEADS 🪙");
        }

        else{
            System.out.println("TAILS 🪙");
        }

    }
}
