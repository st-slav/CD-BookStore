package ru.mamsta.practice.books.javaee7.cdbookstore;

import javax.inject.Inject;

import ru.mamsta.practice.books.javaee7.cdbookstore.model.Book;
import ru.mamsta.practice.books.javaee7.cdbookstore.util.generation.NumberGenerator;
import ru.mamsta.practice.books.javaee7.cdbookstore.util.generation.qualifier.ThirteenDigits;
import ru.mamsta.practice.books.javaee7.cdbookstore.util.logging.Loggable;

@Loggable
public class BookService {
    
    @Inject
    @ThirteenDigits
    private NumberGenerator numberGenerator;
    
    public Book createBook(final String title, final Float price, final String description) {
        final Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generationNumber());
        return book;
    }
}
