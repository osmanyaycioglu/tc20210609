package com.training.micro.rest.design.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.micro.rest.Person;

@RestController
@RequestMapping("/api/v1/person/provision")
// @RequestMapping("/person")
public class PersonRestController {

    @PutMapping
    public String add(@RequestBody final Person person) {
        return "SUCCESS";
    }

    @PatchMapping
    public String update(@RequestBody final Person person) {
        return "SUCCESS";
    }

    @GetMapping
    public Person get(@RequestParam("perid") final long personId) {
        return null;
    }


}
