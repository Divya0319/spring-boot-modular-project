package com.fastturtle.DummyProject1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Dummy 1";
    }
}
