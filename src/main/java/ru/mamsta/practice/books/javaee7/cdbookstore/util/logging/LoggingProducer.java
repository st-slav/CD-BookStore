package ru.mamsta.practice.books.javaee7.cdbookstore.util.logging;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggingProducer {
    
    @Produces
    public Logger produceLogger(final InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
}
