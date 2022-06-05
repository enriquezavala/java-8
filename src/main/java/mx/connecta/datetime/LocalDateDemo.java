package mx.connecta.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateDemo {
    public static void main(String[] args) {
        // a date without a time-zone
        // immutable date-time object that represents a date
        LocalDate now = LocalDate.now();
        System.out.println("Today:" + now);
        
        LocalDate dateOfBirth = LocalDate.of(1985, Month.FEBRUARY, 7);
        System.out.println("Date of birth:" + dateOfBirth);
        
        Period period = dateOfBirth.until(now);
        System.out.println("Years old:" + period.getYears());
    }
}
