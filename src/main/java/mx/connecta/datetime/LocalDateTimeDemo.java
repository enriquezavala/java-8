package mx.connecta.datetime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // a date-time without a time-zone
        // immutable date-time object that represents a date-time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Today:" + now);
        
        LocalDateTime nextDay = now.plusDays(1);
        System.out.println("Tomorrow:" + nextDay);
        
        long hours = now.until(nextDay, ChronoUnit.HOURS);
        System.out.println("Hours between dates:" + hours);
    }
}
