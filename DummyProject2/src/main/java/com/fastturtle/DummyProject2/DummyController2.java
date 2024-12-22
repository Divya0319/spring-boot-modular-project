package com.fastturtle.DummyProject2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController2 {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Dummy 2";
    }
}
