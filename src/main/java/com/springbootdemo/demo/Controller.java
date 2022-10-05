package com.springbootdemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

@RestController
public class Controller {

    @GetMapping("/GTusername")
    public String getGTusername() {
        return "khuynh44";
    }

    @GetMapping("/localtime")
    public String getLocalTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
