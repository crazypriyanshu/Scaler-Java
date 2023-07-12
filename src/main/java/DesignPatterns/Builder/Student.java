package main.java.DesignPatterns.Builder;


public class Student {
    private String name;
    private int age;
    private String universityName;
    private double psp;
    private int gradYear;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Student(Builder builder) throws IllegalAccessException {

        if (builder.getGradYear() > 2015) {
            throw new IllegalAccessException("Grad Year can't be less than 2015");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
        this.gradYear = builder.getGradYear();
    }


    // Builder Class
    public static class Builder {
        private String name;
        private int age;
        private String universityName;
        private double psp;
        private int gradYear;

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;

        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversity(String universityName) {
            this.universityName = universityName;
            return this;

        }
        public Student build() throws IllegalAccessException {
            return new Student(this);
        }


    }

}
