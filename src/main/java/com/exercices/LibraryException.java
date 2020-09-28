package com.exercices;

public class LibraryException extends Exception {

    public LibraryException(String message, Throwable e) {
        super(message, e);
    }

    public LibraryException(String message) {
        super(message);
    }
}
