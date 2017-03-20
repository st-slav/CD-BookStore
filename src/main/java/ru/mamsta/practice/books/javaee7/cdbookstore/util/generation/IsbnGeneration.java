package ru.mamsta.practice.books.javaee7.cdbookstore.util.generation;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

import ru.mamsta.practice.books.javaee7.cdbookstore.util.generation.qualifier.ThirteenDigits;
import ru.mamsta.practice.books.javaee7.cdbookstore.util.logging.Loggable;

@ThirteenDigits
public class IsbnGeneration implements NumberGenerator {

    private static final String PREFIX = "13-84356-";

    @Inject
    private Logger              logger;

    @Loggable
    public String generationNumber() {
        final String isbn = PREFIX + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN: " + isbn);
        return isbn;
    }
}
