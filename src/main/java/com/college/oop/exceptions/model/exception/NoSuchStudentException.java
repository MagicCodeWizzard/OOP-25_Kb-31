package com.college.oop.exceptions.model.exception;

public final class NoSuchStudentException extends IllegalArgumentException {

    public NoSuchStudentException() {
    }

    public NoSuchStudentException(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        String originalString = super.getMessage();

        return "[APP EXCEPTION] -> " + originalString;
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        var oldStack = super.getStackTrace();

        StackTraceElement[] stackTrace = new StackTraceElement[oldStack.length - 1];

        for (int i = 0; i < stackTrace.length; i++) {
            stackTrace[i] = oldStack[i + 1];
        }

        return stackTrace;
    }
}
