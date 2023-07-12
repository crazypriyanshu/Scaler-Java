package main.java.dateAndTime;

import java.time.LocalDateTime;

public class CompareDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2011, 5, 13, 10,00);
        System.out.println(ldt1.compareTo(ldt2));
    }
}
