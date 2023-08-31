package main.java.DesignPatterns.Structural.CompositePattern.ex2;

public class FictionBook implements Book{
    String name;
    boolean checkedOut;
    boolean isPlay;

    public FictionBook(String name, boolean isPlay) {
        this.name = name;
        this.isPlay = isPlay;
        checkedOut = false;
    }

    public void checkout() {
        if (!checkedOut) {
            System.out.println(" Checking out "+ name + "\n");
            checkedOut = true;
        }
        else {
            System.out.println(" This book "+ name + " is already checked out ...");
        }
    }

    public void returnBook() {
        if (checkedOut) {
            System.out.println(" Returning "+ name + " book \n");
            checkedOut = false;
        }
        else {
            System.out.println(" This book "+ name + " is NOT checked out ...");
        }
    }
}
