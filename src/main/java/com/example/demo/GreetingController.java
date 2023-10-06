package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private static final String template = "Welcome %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "to the application") String name) {
    System.out.println("Carlos Ramirez Vera");
    System.out.println("Carlos Ramirez Vera");
    System.out.println("Carlos Ramirez Vera");
    System.out.println("Carlos Ramirez Vera");
    System.out.println("Carlos Ramirez Vera");
    System.out.println("Carlos Ramirez Vera");
    System.out.println("Carlos Ramirez Vera");
    System.out.println("Carlos Ramirez Vera");
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }
}