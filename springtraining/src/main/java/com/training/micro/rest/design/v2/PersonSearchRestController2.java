package com.training.micro.rest.design.v2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.micro.rest.Person;
import com.training.micro.service.PersonSearch;

@RestController
@RequestMapping("/api/v2/person/search")
// @RequestMapping("/person")
public class PersonSearchRestController2 {

    @Autowired
    private PersonSearch ps;

    @GetMapping("/byname")
    public List<Person> searchByName(@RequestParam("name") final String name) {
        return this.ps.searchByName(name);
    }

    @GetMapping("/bysurname")
    public List<Person> searchBySurname(@RequestParam("surname") final String surname) {
        return null;
    }

}
