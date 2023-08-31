package main.java.test.AfterTestPractice.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingSumDigits {
    public static int getSum(Integer x) {
        int sum = 0;
        while (x > 0) {
            sum = sum + x%10;
            x = x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrOfInt = new ArrayList<>();
        arrOfInt.add(102); // 1+0 = 1
        arrOfInt.add(20); // 2+0 = 2
        arrOfInt.add(25); // 2+5 = 7
        arrOfInt.add(75);  // 5

        Collections.sort(arrOfInt, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return getSum(o2) - getSum(o1);
            }
        });

        System.out.println("Sorting based on sum of digits "+arrOfInt);
    }
}
