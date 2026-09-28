import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_And_Times {
    public static void main(String[] args){

        // How to work with DATES & TIMES using java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp

        LocalDate date = LocalDate.now();
        System.out.println(date); // show todays date

        LocalTime time = LocalTime.now();
        System.out.println(time);  // show current time

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);  // show current date and time

        Instant instant = Instant.now();
        System.out.println(instant);  // current utc date and time

        // custom format to display our date and time
        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime1.format(formatter);
        System.out.println(newDateTime);
        // add the pattern in which you want the output

        // custom date time object
        LocalDate date1 = LocalDate.of(2026,12,25);
        System.out.println(date1);

        LocalDateTime dateTime2 = LocalDateTime.of(2026,12,25,12,0,0);
        System.out.println(dateTime2);

        // compare dates
        LocalDateTime dateTime3 = LocalDateTime.of(2026,1,1,0,0,0);
        System.out.println(dateTime3);

        if (dateTime2.isBefore(dateTime3)){
            System.out.println(dateTime2 +" is earlier than "+dateTime3);
        }else if(dateTime2.isAfter(dateTime3)){
            System.out.println(dateTime2 +" is later than "+dateTime3);
        }else if (dateTime2.isEqual(dateTime3))
            System.out.println(dateTime3 +" is equals to "+dateTime2);
        }
}

