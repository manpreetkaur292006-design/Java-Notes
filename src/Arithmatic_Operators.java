public class Arithmatic_Operators {
    public static void main(String[] args){
        // Arithmetic Operators
        // to push the changes - press ctrl + shift + k
        int x=10;
        int y=2;
        int z;
        System.out.println("Number-1: "+x);
        System.out.println("Numver-2: "+y);
        z=x+y;  // Addition
        System.out.println("Addition: "+z);
        z=x-y;  // Subtraction
        System.out.println("Subtraction: "+z);
        z=x*y;  // Multiplication
        System.out.println("Multiplication: "+z);
        z=x/y;  // Division
        System.out.println("Division: "+z);
        z=x%y;  // Modulus - Remainder
        System.out.println("Remainder: "+z);

        // Augmented Assignment Operators
        x+=y;  // x=x+y
        System.out.println("X+Y="+x);
        x-=y;  // x=x-y
        System.out.println("X-Y="+x);
        x*=y;  // x=x*y
        System.out.println("X*Y="+x);
        x/=y;  // x=x/y
        System.out.println("X/Y="+x);
        x%=y;  // x=x%y
        System.out.println("X%Y="+x);

        // we have assignmed the variables in int format that is why
        // when we divide 10/3 we will get 3 that is an int as we have defined
        // it as int if we define both x and y as double then we will get the
        // decimal part also as shown below
        int a=10;
        int b=3;
        System.out.println("A/B="+a/b);  // this will behave as the floor division
        double c=10;
        double d=3;
        System.out.println("A/B="+c/d);  // this will behave as a normal division

        // Increment and Decrement Operators
        int p=1;
        p++;   // p+=1 , p=p+1
        p++;
        p++;   // p=4
        p--;   // p-=1 , p=p-1
        p--;
        System.out.println(p);

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // PEMDAS = Parentheses,exponents,multiplication,division,addition & subtraction
        double result=3+4*(7-5)/2.0;
        System.out.println(result);
        // solving : from left to right
        // 1. 3+4*(2)/2.0
        // 2. 3+8/2.0
        // 3. 3+4.0
        // 4. 7.0
    }
}
