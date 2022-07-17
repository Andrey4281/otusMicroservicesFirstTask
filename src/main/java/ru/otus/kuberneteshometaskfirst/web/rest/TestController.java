package ru.otus.kuberneteshometaskfirst.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/health")
    public ResponseEntity<Void> test() {
        return ResponseEntity.ok().build();
    }
}
