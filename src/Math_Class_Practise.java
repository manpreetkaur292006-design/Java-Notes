import java.util.Scanner;

public class Math_Class_Practise {
    public static void main(String[] args){

        // MATH CLASS PRACTISE

        Scanner scanner=new Scanner(System.in);

        // HYPOTENUSE: c=Math.sqrt(a^2+b^2)

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a=scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b=scanner.nextDouble();

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.print("The hypotenuse (side C) is: "+c+" cm");

        // CALCULATE THE CIRCUMFERENCE , AREA AND VOLUME OF THE CIRCLE
        // IF THE RADIUS OF THE CIRCLE IS GIVEN

        // CIRCUMFERENCE = 2*Math.PI*RADIUS
        // AREA = Math.PI*Math.pow(RADIUS,2)
        // VOLUME = (4.0/3.0)*Math.PI*Math.pow(RADIUS,3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("\nEnter the radius of the circle: ");
        radius=scanner.nextDouble();

        circumference=2*Math.PI*radius;
        area=Math.PI*Math.pow(radius,2);
        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);

        System.out.printf("The Circumference of the circle is: %.1fcm\n",circumference);
        System.out.printf("The Area of the circle is: %.1fcm^2\n",area);
        System.out.printf("The volume of the circle is: %.1fcm^3\n",volume);

        // write printf in place of println and in the quotes also all this  %.1fcm
        //  %.1fcm this line will show only one number after the decimal and here the cm
        // in the end will me placed in the ending of the number like (21.2cm)
        //  %.2f : similarly this will show two numbers after the decimal
        // %.1fcm : this will give the result in the new line with one number after decimal having unit cm

        // to get the power three in the windows type alt+0179 when the numlock is on

        scanner.close();
    }
}
