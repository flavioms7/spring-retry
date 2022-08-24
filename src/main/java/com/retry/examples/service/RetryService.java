package com.retry.examples.service;

import com.retry.examples.component.RetryComponent;
import com.retry.examples.exception.NumberNotFoundException;
import com.retry.examples.exception.RetryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetryService {

    @Autowired
    RetryComponent retryComponent;

    public String retryOperation(int number) {

        try {
            retryComponent.doRetry(number);
            return "Good Luck!";
        } catch (NumberNotFoundException | RetryException err){
            return "Bad Luck! | Reason: " + err;
        }
    }
}
