package com.example.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {
    @GetMapping
    public ResponseEntity<String> show() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
