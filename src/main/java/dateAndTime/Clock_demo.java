package main.java.dateAndTime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Clock_demo {
    public static void main(String[] args) {
        Clock clock =  Clock.systemDefaultZone();
        System.out.println(clock);
        Instant it1 = clock.instant();
        System.out.println(it1);

        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1);

        Clock clock2 = Clock.offset(clock, Duration.ofHours(10));
        System.out.println(clock2.instant());
    }
}
