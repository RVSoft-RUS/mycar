package ru.rvsoft.mycarclient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/time")
    public ResponseEntity<String> getTime() {
        String time = LocalDateTime.now().toString();
        return ResponseEntity.ok().body(time);
    }
}
