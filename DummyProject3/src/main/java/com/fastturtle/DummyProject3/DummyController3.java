package com.fastturtle.DummyProject3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController3 {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Dummy 3";
    }
}
