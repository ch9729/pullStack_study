package com.secure.notes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/contact")
    public String sayContact() {
        return "Contact";
    }

    @GetMapping("/public/abc")
    public String publicAbc() {
        return "인증필요없음";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi";
    }
}
