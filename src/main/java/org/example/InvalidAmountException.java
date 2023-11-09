package org.example;

public class InvalidAmountException extends RuntimeException {

    public static final String EXCEPTION_MESSAGE = "Wrong amount given";

    public InvalidAmountException() {
        super(EXCEPTION_MESSAGE);
    }

}
