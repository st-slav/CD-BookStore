package ru.mamsta.practice.books.javaee7.cdbookstore.util.generation;

import java.util.Random;
import java.util.logging.Logger;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import ru.mamsta.practice.books.javaee7.cdbookstore.util.generation.qualifier.ThirteenDigits;
import ru.mamsta.practice.books.javaee7.cdbookstore.util.logging.Loggable;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {
    
    private static final String PREFIX = "MOCK-";
    
    @Inject
    private Logger logger;

    @Loggable
    public String generationNumber() {
        final String mock = PREFIX + Math.abs(new Random().nextInt());
        logger.info("Generated Mock:" + mock);
        return mock;
    }
}
