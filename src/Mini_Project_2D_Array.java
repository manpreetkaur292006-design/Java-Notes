public class Mini_Project_2D_Array {
    public static void main(String[] args) {

        // printing the telephone key pad

        // matric of telephone key pad
        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for(char[] row :telephone) {  // rows
            for (char number : row) {   // cols
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
