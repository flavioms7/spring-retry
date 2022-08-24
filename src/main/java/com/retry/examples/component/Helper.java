package com.retry.examples.component;

import org.springframework.stereotype.Component;

@Component
public class Helper {

    public int randomNumber() {
        int min = 1;
        int max = 10;
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
