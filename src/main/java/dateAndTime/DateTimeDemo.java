package main.java.dateAndTime;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2022,11,15);
        System.out.println(ld2);
        LocalTime lt1 = LocalTime.now();

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2023, 12, 13, 10,10);
        System.out.println(ldt2);
        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);
        System.out.println(ldt3);

        // month day
        MonthDay md1 = MonthDay.of(10, 15);
        System.out.println(md1);
        LocalDate newLD = md1.atYear(2022);
        System.out.println(newLD);

        // year month
        YearMonth ym = YearMonth.now();
        System.out.println(ym);
        LocalDate yearMonthDate = ym.atDay(12);
        System.out.println(yearMonthDate);

        // Zone Id :
//        for(String zoneId: ZoneId.getAvailableZoneIds()) {
////            System.out.println(zoneId);
//
//            ZoneId zoneID1 = ZoneId.of(zoneId);
//            String zoneIDDisplayName = zoneID1.getDisplayName(TextStyle.FULL, Locale.FRANCE);
//            System.out.println(zoneId+" : "+zoneIDDisplayName);
//        }

        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        LocalDateTime ldt_1 = LocalDateTime.now();
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt_1, zoneId);
        System.out.println(zdt1);

        ZonedDateTime zdt2 = ldt_1.atZone(zoneId);
        System.out.println(zdt2);

    }
}
