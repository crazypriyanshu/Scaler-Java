package main.java.oops_inheritance2;

public class Cat extends Animal{
    protected int d2 = 20;
    public int d1 = 200;
    public Cat(String name) {
        super(name);
    }
    public void meaon() {
        System.out.println(name+" is meaoiiing...");
    }
    public void eat(String food) {
        System.out.println(name+ " is eating like a Cat, inherited na@"+ food +" is being chewed");
    }
}
