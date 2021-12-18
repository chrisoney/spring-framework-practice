package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  private static final String template="Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/users")
  public User user(@RequestParam(value = "name", defaultValue = "Chris") String name) {
    return new User(counter.incrementAndGet(), String.format(template, name));
  }
}