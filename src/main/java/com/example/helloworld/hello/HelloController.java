package com.example.helloworld.hello;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {

        if (StringUtils.hasText(name)) {

            return "Hello!! " + name;
        }
        return "Hello World";
    }


}
