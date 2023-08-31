package main.java.DesignPatterns.Structural.Prototype;

import main.java.PrototypeDesignPattern.Prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private double batchAvgPsp;

    public void setPsp(double psp) {
        this.psp = psp;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBatchAvgPsp() {
        return batchAvgPsp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
    public String getBatch() {
        return batch;
    }


    public void setBatchAvgPsp(double batchAvgPsp) {
        this.batchAvgPsp = batchAvgPsp;
    }

    public Student(){}

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.batchAvgPsp = student.batchAvgPsp;
        this.psp = student.psp;
    }

    public Student clone() {
        return new Student(this);
    }
}
