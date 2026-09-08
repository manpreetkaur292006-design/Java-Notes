import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        // Calculate the area of the rectangle
        // Area of the Rectangle = length * breadth
        Scanner scanner=new Scanner(System.in);

        // method - 1 (my method)
        System.out.println("Calculating the area of the Rectangle !!");

        System.out.println("Enter the length :");
        double l = scanner.nextDouble();
        System.out.println("Enter the breadth :");
        double b = scanner.nextDouble();

        double area = l*b;
        System.out.println("The area of the Rectangle having length "+l+" and breadth "+b+" is :");
        System.out.println(area);

        // method - 2 (from lecture)
        double width = 0;
        double height = 0;
        double a = 0;
        System.out.println("Enter the width : ");
        width = scanner.nextDouble();
        System.out.println("Enter the height : ");
        height = scanner.nextDouble();
        a = width*height;

        System.out.println("The area is : "+a+"cm^2");
        // on the numlock and hold alt+ the type 0178 to get power 2 in superscript

        scanner.close();


    }
}
