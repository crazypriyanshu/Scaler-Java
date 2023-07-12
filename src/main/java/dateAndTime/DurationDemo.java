package main.java.dateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo {
    public static void main(String[] args) {
        Duration d1 = Duration.of(1, ChronoUnit.DAYS);
        Duration d2 = Duration.of(1, ChronoUnit.NANOS);
        System.out.println(d1);
        System.out.println(d2);

        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(15, 0);
        Duration d = Duration.between(lt2, lt1);
        System.out.println(d);
    }
}
