package main.java.PrototypeDesignPattern;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private double psp;
    private String batch;
    private double batchPSP;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch(){
        return batch;
    }

    public Double getbatchPSP(){
        return batchPSP;
    }

    public void setBatchPSP(double batchPSP) {
        this.batchPSP = batchPSP;
    }

    public Student() {}
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.batchPSP = student.batchPSP;
        this.psp = student.psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }



    public Student clone() {
        return new Student(this);
    }
}
