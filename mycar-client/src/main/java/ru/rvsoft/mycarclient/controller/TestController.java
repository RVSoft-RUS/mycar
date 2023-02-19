package ru.rvsoft.mycarclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
//@RequestMapping("/main")
public class TestController {
    @Value("${eureka.instance.instance-id}")
    private String id;
    @Autowired
    Environment environment;

    @GetMapping("/test")
    public ResponseEntity<String> getTime() {
        String port = environment.getProperty("local.server.port");

        String time = LocalDateTime.now().toString()
                .concat("\n\n     port=" + port)
                .concat("\n\n     id=" + id);
        return ResponseEntity.ok().body(time);
    }
}
