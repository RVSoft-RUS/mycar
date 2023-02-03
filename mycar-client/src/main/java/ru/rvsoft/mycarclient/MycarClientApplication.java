package ru.rvsoft.mycarclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient похоже больше не нужна
public class MycarClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycarClientApplication.class, args);
    }

}
