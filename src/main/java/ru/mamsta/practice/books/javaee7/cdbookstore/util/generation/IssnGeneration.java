package ru.mamsta.practice.books.javaee7.cdbookstore.util.generation;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

import ru.mamsta.practice.books.javaee7.cdbookstore.util.generation.qualifier.EigthDigits;
import ru.mamsta.practice.books.javaee7.cdbookstore.util.logging.Loggable;

@EigthDigits
public class IssnGeneration implements NumberGenerator {

    private static final String PREFIX = "8-";

    @Inject
    private Logger              logger;

    @Loggable
    public String generationNumber() {
        final String issn = PREFIX + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN: " + issn);
        return issn;
    }

}
