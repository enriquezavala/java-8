package mx.connecta.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantDemo {
    public static void main(String[] args) {
        // an instantaneous point on the time-line
        Instant now = Instant.now();
        System.out.println("Today:" + now);
        
        Instant nextWeek = now.plus(7, ChronoUnit.DAYS);
        System.out.println("Next week:" + nextWeek);
        
        Duration duration = Duration.between(now, nextWeek);        
        System.out.println("Days between dates:" + duration.toDays());
    }
}
