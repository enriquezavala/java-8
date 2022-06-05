package mx.connecta.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        // a date-time with a time-zone
        // immutable representation of a date-time with a time-zone
        ZonedDateTime today = ZonedDateTime.now();
        System.out.println("Today:" + today);
        
        ZonedDateTime newYork = ZonedDateTime.of(
        LocalDateTime.now(),
        ZoneId.of("America/New_York")      
        );
        System.out.println("New York:" + newYork);
        
        ZonedDateTime vancouver = ZonedDateTime.of(
                2021, 4, 21,
                06, 24, 32, 0,
                ZoneId.of("America/Vancouver") // zone
        );
        System.out.println("Vancouver:" + vancouver);
        
        ZonedDateTime london = today.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("London:" + london);
    }
}
