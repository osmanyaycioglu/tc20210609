package com.training.micro.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstRest {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world GET";
    }

    @PostMapping("/hello")
    public String hello2() {
        return "Hello world POST";
    }

    @PutMapping("/hello")
    public String hello3() {
        return "Hello world PUT";
    }

    @PatchMapping("/hello")
    public String hello4() {
        return "Hello world PATCH";
    }

    @DeleteMapping("/hello")
    public String hello5() {
        return "Hello world DELETE";
    }


}
