package com.retry.examples.exception;

public class RetryException extends RuntimeException {

    public RetryException(String ErrorMessage){
        super(ErrorMessage);
    }
}
