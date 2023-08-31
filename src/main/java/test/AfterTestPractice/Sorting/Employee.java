package main.java.test.AfterTestPractice.Sorting;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

//    Nested Comparison
    public int compareTo(Employee employee) {
        if (age == employee.age) {
            return (salary - employee.salary);
        }
        return age - employee.age;
    }

    public String toString() {
        return String.format("(%s, %d, %s)", name, salary, age);
    }

}
