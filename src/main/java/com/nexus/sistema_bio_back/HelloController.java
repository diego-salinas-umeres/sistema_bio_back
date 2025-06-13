package com.nexus.sistema_bio_back;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hola, Spring Boot";
    }
}
123456446