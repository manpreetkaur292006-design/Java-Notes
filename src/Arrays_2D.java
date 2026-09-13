public class Arrays_2D {
    public static void main(String[] args){

        // 2D array = An array where each element is an array
        // Useful for storing a matrix of data

        // 1D array examples
        String[] fruits = {"apple","orange","banana"};
        String[] vegetables = {"potato","onion","carrot"};
        String[] meats = {"chicken","pork","beaf","fish"};

        // 2D array
        // String[] means array of strings data type
        String[][] groceries = {fruits, vegetables,meats};

        // another way to do above things
        //        String[][] groceries = {
//                {"apple","orange","banana"},
//                {"potato","onion","carrot"},
//                {"chicken","pork","beaf","fish"}
//        };

        // accessing single element in the matric and change its value
        groceries[0][0]="pineapple";

        for (String[] foods : groceries){
//            System.out.println(foods);
            // this will give the memory address of the sub arrays
            // because arrays are reference datatypes
            // so we need to use the nested loo[
            for (String food : foods){
                System.out.print(food+" ");
            }
            System.out.println();  // we will get the matric of the data by this loop
        }

    }
}
