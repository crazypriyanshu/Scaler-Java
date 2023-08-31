package main.java.DesignPatterns.Structural.CompositePattern.ex2;

public class Client {
    public static void main(String[] args) {
        NonFictionBook nonFictionBook = new NonFictionBook("A History in Time", true);
        FictionBook fictionBook1 = new FictionBook("Hamlet", true);
        FictionBook fictionBook2 = new FictionBook(" Termiaci ", false);

        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(nonFictionBook);
        bookCollection.addBook(fictionBook1);
        bookCollection.addBook(fictionBook2);

        checkOutBooks(nonFictionBook);
        checkOutBooks(fictionBook1);
        checkOutBooks(fictionBook2);

        returnBooks(nonFictionBook);
        returnBooks(fictionBook1);
        returnBooks(fictionBook2);

//        BookCollection bookCollection = new BookCollection();
//        bookCollection.addNonFictionalBook(nonFictionBook);
//        bookCollection.addFictionalBook(fictionBook1);
//        bookCollection.addFictionalBook(fictionBook2);
//
//        checkoutNonFictionalBook(nonFictionBook);
//        checkoutFictionalBook(fictionBook1);
//        checkoutBookCollection(bookCollection);
//
//        returnNonFictionalBook(nonFictionBook);
//        returnFictionalBook(fictionBook2);
//        returnBookCollection(bookCollection);


    }

    public static void checkOutBooks(Book book){
        System.out.println(" Checking out from  ...");
        book.checkout();
    }

    public static void returnBooks(Book book){
        System.out.println(" Checking out from ");
        book.returnBook();
    }

//    public static void checkoutNonFictionalBook(NonFictionBook nonFictionBook) {
//        nonFictionBook.checkout();
//    }
//    public static void checkoutFictionalBook(FictionBook fictionBook) {
//        fictionBook.checkout();
//    }
//
//    public static void checkoutBookCollection(BookCollection bookCollection) {
//        bookCollection.checkout();
//    }
//
//    public static void returnNonFictionalBook(NonFictionBook nonFictionBook){
//        nonFictionBook.returnBook();
//    }
//    public static void returnFictionalBook(FictionBook fictionBook){
//        fictionBook.returnBook();
//    }
//    public static void returnBookCollection(BookCollection bookCollection){
//        bookCollection.returnBook();
//    }
}
