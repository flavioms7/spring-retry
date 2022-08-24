package com.retry.examples.component;

import com.retry.examples.exception.NumberNotFoundException;
import com.retry.examples.exception.RetryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Component
public class RetryComponent {

    @Autowired
    Helper helper;

    @Retryable(value = RetryException.class, maxAttempts = 6, backoff = @Backoff(delay = 1000))
    public void doRetry(int number) {

        var numberRand = helper.randomNumber();

        if (number == numberRand) {
            System.out.println("SUCCESS BECAUSE: " + number + " equal " + numberRand);
        } else {
            System.out.println("TRY AGAIN BECAUSE: " + number + " not equal " + numberRand + "\n");
            throw new RetryException("Number not found, Try Again!!!");
        }
    }

    @Recover
    private void doRecovery(RetryException e, int number) {

        System.out.println("No random number match with number " + number + "\n");
        throw new NumberNotFoundException("No random number match with number " + number);
    }
}
