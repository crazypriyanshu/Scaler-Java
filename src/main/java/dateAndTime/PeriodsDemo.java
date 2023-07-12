package main.java.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodsDemo {
    public static void main(String[] args) {
        Period p1 = Period.of(2,1,1);
        System.out.println(p1);
        Period pd = Period.ofDays(1000);
        System.out.println(pd);

        LocalDate ldt1 = LocalDate.of(2022, 11, 10);
        LocalDate ldt2 = LocalDate.now();
        Period p3 = Period.between(ldt1, ldt2);
        System.out.println(p3); // 7 months 9 days between now and
        System.out.println(p3.getDays());
        long noOfDaysBetweenDates = ChronoUnit.DAYS.between(ldt1, ldt2);
        System.out.println(noOfDaysBetweenDates);
    }
}
