package com.retry.examples.exception;

public class NumberNotFoundException extends RuntimeException {

    public NumberNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
