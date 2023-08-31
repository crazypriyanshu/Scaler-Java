package main.java.DesignPatterns.Structural.Prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;

    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
