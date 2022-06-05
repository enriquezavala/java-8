package mx.connecta.datetime;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        // a time without a time-zone
        // immutable date-time object that represents a time
        LocalTime now = LocalTime.now();
        System.out.println("Time:" + now);
        
        LocalTime bedTime = LocalTime.of(23, 00);
        System.out.println("Bed time:" + bedTime);
        
        LocalTime wakeup = bedTime.plusHours(8);
        System.out.println("Wake up:" + wakeup);
    }
}
