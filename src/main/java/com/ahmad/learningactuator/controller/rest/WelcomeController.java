package com.ahmad.learningactuator.controller.rest;

import com.ahmad.learningactuator.actuator.service.Greetings;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RequestMapping
@RestController
public class WelcomeController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/hello-world")
    @ResponseBody
    public Greetings helloWorld(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {

        return new Greetings(counter.incrementAndGet(), String.format(template, name));

    }

}
