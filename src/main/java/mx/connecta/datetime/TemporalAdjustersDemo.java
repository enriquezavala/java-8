package mx.connecta.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Month:" + now.getMonth());
        
        LocalDate nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Next monday:" + nextMonday);
        
        LocalDate lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of month:" + lastDayOfMonth);
    }
}
