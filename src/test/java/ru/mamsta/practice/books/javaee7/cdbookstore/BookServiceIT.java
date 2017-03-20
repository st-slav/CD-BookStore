package ru.mamsta.practice.books.javaee7.cdbookstore;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import ru.mamsta.practice.books.javaee7.cdbookstore.model.Book;
import ru.mamsta.practice.books.javaee7.cdbookstore.util.logging.Loggable;

@Loggable
public class BookServiceIT {
    
    private static final String PREFIX = "MOCK";
    
    @Test
    public void shouldCheckNumberIsMOCK() {
        final Weld weld = new Weld();
        final WeldContainer container = weld.initialize();
        final BookService bookService = container.instance().select(BookService.class).get();
        final Book book = bookService.createBook("H2G2", 12.5f, "Book about IT");
        assertTrue(book.getNumber().startsWith(PREFIX));
        System.out.println("create book: " + book);
        weld.shutdown();
    }

}
