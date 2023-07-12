package main.java.DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        Student student = Student.getBuilder()
                .setName("Priyanshu")
                .setAge(32)
                .setPsp(98.21)
                .setGradYear(2011)
                .setUniversity("KVG")
                .build();
        System.out.println("DEBUG");
    }


}
