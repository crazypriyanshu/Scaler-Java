package main.java.test.AfterTestPractice.Sorting;

import java.util.Arrays;

public class CustomObjectSort {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Amit", 25, 2500);
        employees[1] = new Employee("Sumit", 35, 3000);
        employees[2] = new Employee("Gurmeet", 35, 3500);
        employees[3] = new Employee("Arun", 45, 4500);

        Arrays.sort(employees);
        System.out.println("After sorting : "+Arrays.toString(employees));


    }
}
