package com.projects.springboot.exception;

public class BookIdMismatchException extends RuntimeException{
    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookIdMismatchException() {

    }
}
