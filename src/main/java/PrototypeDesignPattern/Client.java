package main.java.PrototypeDesignPattern;

public class Client {
    public static void fillRegistry(StudentRegistry registry) {
        // this is here because Client is setting batch and batch psp

        Student april2022batch = new Student();
        april2022batch.setBatch("April 2022 Intemediate");
        april2022batch.setBatchPSP(76.9);
        // put in registry which is a hash map
        registry.register("April 2022 batch", april2022batch);

        IntelligentStudent april2022IntelligentStudent = new IntelligentStudent();
        april2022IntelligentStudent.setBatch("April-2022-IntelligentStudent");
        april2022IntelligentStudent.setBatchPSP(90.45);
        // put it in registry
        registry.register("April 2022 batch of Intelligent Students", april2022IntelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student priyanshu = registry.get("April 2022 batch").clone();
        priyanshu.setName("Priyanshu Das");
        priyanshu.setAge(32);
        priyanshu.setPsp(66.06);

        Student urvi = registry.get("April 2022 batch of Intelligent Students").clone();
        urvi.setName("Urvi");
        urvi.setAge(30);
        urvi.setPsp(79.9);
        // how do i set iq


        Student amrit = registry.get("April 2022 batch").clone();
        amrit.setName("Amrit Pal Singh");
        amrit.setAge(38);
        amrit.setPsp(69.69);
        System.out.println("Debug");
    }
}
