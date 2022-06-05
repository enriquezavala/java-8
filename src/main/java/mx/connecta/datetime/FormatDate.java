package mx.connecta.datetime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {
        ZonedDateTime today = ZonedDateTime.now();
        System.out.println("Local date:" + DateTimeFormatter.ISO_LOCAL_DATE.format(today));
        System.out.println("Local time:" + DateTimeFormatter.ISO_LOCAL_TIME.format(today));
        System.out.println("Local date time:" + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(today));
        System.out.println("Zoned date time:" + DateTimeFormatter.ISO_ZONED_DATE_TIME.format(today));
    }
}
