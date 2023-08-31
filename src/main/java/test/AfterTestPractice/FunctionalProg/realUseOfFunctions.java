package main.java.test.AfterTestPractice.FunctionalProg;

public class realUseOfFunctions {
    protected static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader {
        public final NoArgFunction<Person> loadPerson;
        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment
                    ? this::loadDataFake
                    : this::loadDataReal;

        }
        private Person loadDataReal() {
            System.out.println("Returning Real Person");
            return new Person("Real Person", 30);
        }

        private Person loadDataFake() {
            System.out.println("Returning Fake Person");
            return new Person("Fake Person", 100);
        }
    }
    public static void main(String[] args) {
        final boolean isDevelopment = false;
        DataLoader dataLoader = new DataLoader(isDevelopment);
        System.out.println(dataLoader.loadPerson.apply());


    }
}
