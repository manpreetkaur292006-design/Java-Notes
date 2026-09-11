public class PrintF {
    public static void main(String[] args){

        // printf() = is a method used to format output
        // one place holder % and one of the character as listed below
        // %[flags][width][.precision][specifier-character]

        String name = "Manpreet";
        char firstLetter='M';
        int age=20;
        double height=171.5;
        boolean isEmployed=true;

        System.out.printf("Hello %s\n",name);
        // %s: here s is the specifier character means we are inserting a string

        System.out.printf("You name starts with a %c\n",firstLetter);
        // %c: c for the char variable data type
        // \n: to insert a new line add this , otherwise the output will be all in the same line
        // here in the printf statements we have to manually insert the new line characters

        System.out.printf("You are %d years old\n",age);
        // %d: d for the integer variable data type

        System.out.printf("You are %f centi-meters tall\n",height);
        // %f: f for the double variable data type

        System.out.printf("Employed: %b\n",isEmployed);
        // %b: b for the boolean variable data type

        // inserting multiple variables in a same line
        System.out.printf("%s is %d years old\n",name,age);

        // these were the specifier characters usage

        // now we will cover the precision
        double price1=9.99;
        double price2=100.15;
        double price3=-54.01;

        // we will use printf to display these prices
        // when we use printf for the double number usually it displays 6 digits after the decimal point
        // we would like to limit that as follows - we are going to se the precision
        // this would automatically round off the integers

        System.out.printf("%.1f\n",price1);  // this will display one digit after decimal for two write .2 inplace of .1
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.3f\n",price3);

        // now we have flags next
        // following are some different falgs that we can add

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numvers are enclosed in ()
        // space = display a minus if negative, space if positive

        // + will add a positive sign to a positive numbers only

        System.out.printf("%+.1f\n",price1);
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%+.3f\n",price3);

        // , grouping separator after the thousand place
        // add the commas in the number (-54,000.010)

        price1=9000.99;
        price2=100000.15;
        price3=-54000.01;

        System.out.printf("%,.1f\n",price1);
        System.out.printf("%,.2f\n",price2);
        System.out.printf("%,.3f\n",price3);

        // ( this will enclose all the negative number in the () - like "(54000.010)"

        System.out.printf("%(.1f\n",price1);
        System.out.printf("%(.2f\n",price2);
        System.out.printf("%(.3f\n",price3);

        // space - like ( 100000.15) and (-54000.010) - its good for aligning numbers

        System.out.printf("% .1f\n",price1);
        System.out.printf("% .2f\n",price2);
        System.out.printf("% .3f\n",price3);

        // width specifier
        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7890;

        // these ints have a varying number of digits and by
        // using the width we can align these

        System.out.printf("%d\n",id1);
        System.out.printf("%d\n",id2);
        System.out.printf("%d\n",id3);
        System.out.printf("%d\n",id4);

        // 0 padding
        // here java wants that by how many character we want to padd the number with zero
        // we have added 4 as we have max number of digits ti be 4
        // now they will be aligned vertically

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        // number = to right justify the variables
        // just remove the zero from the above code and you will
        // get spaces in place of zeros

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        // negative number is used to left justify the values
        // just add - in front of 4 to left justify teh values and
        // we still have the spaces in the right side of the numbers

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);

    }
}
