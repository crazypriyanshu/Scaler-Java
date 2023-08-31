package main.java.DesignPatterns.Structural.Prototype;

public class Client {
    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student apr2022Batch = new Student();
        apr2022Batch.setBatch("April 2022 Interm");
        apr2022Batch.setBatchAvgPsp(75.56);
        studentRegistry.register("apr2022Batch", apr2022Batch);

        Student march2023Batch = new Student();
        march2023Batch.setBatchAvgPsp(90.87);
        march2023Batch.setBatch("March 2023 Experts");
        studentRegistry.register("march2022", march2023Batch);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student priyanshu = studentRegistry.get("march2022").clone();
        priyanshu.setName("Priyanshu");
        priyanshu.setAge(32);
        priyanshu.setPsp(67.9);

        Student urvi = studentRegistry.get("apr2022Batch").clone();
        urvi.setName("urvi");
        urvi.setAge(30);
        urvi.setPsp(69.9);

        Student urvi2 = studentRegistry.get("apr2022Batch").clone();
        urvi2.setName("urvi2");
        urvi2.setAge(31);
        urvi2.setPsp(90.9);

    }
}
