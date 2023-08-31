package main.java.DesignPatterns.Structural.CompositePattern.ex2;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class BookCollection implements Book{
//    private ArrayList<NonFictionBook> nonFictionBooks = new ArrayList<>();
//    private ArrayList<FictionBook> fictionBooks = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        System.out.println(" Adding book ");
        books.add(book);

    }
//    public void addFictionalBook(FictionBook fictionBook) {
//        fictionBooks.add(fictionBook);
//
//    }

    public void checkout() {
        books.forEach(Book::checkout);

    }

    public void returnBook() {
        books.forEach(Book::returnBook);
    }
}
