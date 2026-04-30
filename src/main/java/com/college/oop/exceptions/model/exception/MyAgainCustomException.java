package com.college.oop.exceptions.model.exception;

public class MyAgainCustomException extends RuntimeException {
    public MyAgainCustomException() {
        super();
    }

    public MyAgainCustomException(String message) {
        super(message);
    }
}
