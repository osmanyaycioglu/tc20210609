package com.training.micro.service;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.micro.data.PersonStorage;
import com.training.micro.rest.Person;

@Service
public class PersonService {

    @Autowired
    private PersonStorage personStorage;

    public String add(@Validated @RequestBody final Person person) {
        this.personStorage.add(person);
        return "SUCCESS";
    }

    public String update(@Validated @RequestBody final Person person) {
        this.personStorage.change(person);
        return "SUCCESS";
    }

    public Person get(@NotNull @RequestParam("perid") final Long personId) {
        return this.personStorage.get(personId);
    }

}
