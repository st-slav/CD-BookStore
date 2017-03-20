package ru.mamsta.practice.books.javaee7.cdbookstore;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import ru.mamsta.practice.books.javaee7.cdbookstore.model.Book;

public class Main {

    public static void main(String[] args) {

        final Weld weld = new Weld();
        final WeldContainer container = weld.initialize();
        
        final BookService bookService = container.instance().select(BookService.class).get();
        
        final Book book = bookService.createBook("H2G2", 12.5f, "Interesting book about IT");
        
        System.out.println(book);
        
        weld.shutdown();
    }
}
