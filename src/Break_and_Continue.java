public class Break_and_Continue {
    public static void main(String[] args){

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for (int i=0; i<10; i++) {

            if (i == 7) { // break the loop when i = 7
                break;
            }

            if (i==5){  // skip the iteration when i = 5
                continue;
            }

            System.out.print(i+ " ");

        }
    }
}
