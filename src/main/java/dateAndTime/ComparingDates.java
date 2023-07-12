package main.java.dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ComparingDates {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        String formattedDate = DateTimeFormatter.BASIC_ISO_DATE.format(ldt1);
        System.out.println(formattedDate);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMMM-yyy");
        System.out.println(dtf1.format(ldt1));

        String formatStyleDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt1);
        System.out.println(formatStyleDate);








        LocalDateTime ldt2 = LocalDateTime.of(2022, 10,10, 10, 20);
        System.out.println(ldt2.compareTo(ldt1));
        System.out.println(ldt1.isAfter(ldt2));
        System.out.println(ldt1.isBefore(ldt2));
        System.out.println(ldt1.isEqual(ldt2));
    }
}
