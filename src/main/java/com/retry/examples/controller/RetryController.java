package com.retry.examples.controller;

import com.retry.examples.service.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RetryController {

    @Autowired
    RetryService retryService;

    @GetMapping("/retry")
    public ResponseEntity retry(@RequestParam int number) {

        return ResponseEntity.ok().body(retryService.retryOperation(number));
    }
}
