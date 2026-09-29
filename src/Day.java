// this file is made for the implementation of
// the concept of enums in java

public enum Day {

    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7),
    PIZZADAY(8);

    // constants are written in all caps
    // ABOVE WE HAVE DEFINED THE ENUM CONSTANTS AND
    // THEY HAVE VALUES FROM 1 TO 7

    // making the above things private and unchangable (final)
    private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber=dayNumber;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }

}
