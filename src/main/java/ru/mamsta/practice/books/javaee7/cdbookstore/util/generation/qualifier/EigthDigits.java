package ru.mamsta.practice.books.javaee7.cdbookstore.util.generation.qualifier;

import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, METHOD})
public @interface EigthDigits {

}
