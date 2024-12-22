package com.fastturtle.oauth_resource_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController3 {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from oauth resource server";
    }
}
