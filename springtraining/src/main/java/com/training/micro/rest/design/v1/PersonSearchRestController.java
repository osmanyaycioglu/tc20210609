package com.training.micro.rest.design.v1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.micro.rest.Person;

@RestController
@RequestMapping("/api/v1/person/search")
// @RequestMapping("/person")
public class PersonSearchRestController {

    @GetMapping("/byname")
    public List<Person> get(@RequestParam("name") final String name) {
        return null;
    }

}
