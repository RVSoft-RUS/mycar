package ru.rvsoft.mycar.mycarclienttest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class TestController {

    @GetMapping("/name")
    public ResponseEntity<String> getTime() {
        String name = this.getClass().getSimpleName();
        return ResponseEntity.ok().body(name);
    }
}
