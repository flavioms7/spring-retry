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

    public String initRetry(int number) throws RetryException {

        try {
            retryComponent.doRetry(number);
            return "Good Luck!";
        }catch (NumberNotFoundException err){
            return "Bad Luck! | Reason: " + err;
        }catch (RetryException err) {
            return "Bad Luck! | Reason: " + err;

        }
    }
}
