package com.training.micro.rest.design.v2;

import java.util.Set;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.micro.rest.Address;
import com.training.micro.rest.Person;
import com.training.micro.rest.PersonStatus;
import com.training.micro.rest.Phone;
import com.training.micro.service.PersonService;

@RestController
@RequestMapping("/api/v2/person/provision")
// @RequestMapping("/person")
@Validated
public class PersonRestController2 {

    @Autowired
    private PersonService ps;

    @PostMapping("/add")
    public String add(@Validated @RequestBody final Person person) {
        PersonStatus personStatusLoc = person.getPersonStatus();
        if (personStatusLoc != null) {
            personStatusLoc.setPerson(person);
        }
        Set<Address> addrsLoc = person.getAddrs();
        for (Address addressLoc : addrsLoc) {
            addressLoc.setPerson(person);
        }
        Set<Phone> persaonsLoc = person.getPhones();
        for (Phone addressLoc : persaonsLoc) {
            addressLoc.setPerson(person);
        }
        return this.ps.add(person);
    }

    @PostMapping("/update")
    public String update(@Validated @RequestBody final Person person) {
        return this.ps.update(person);
    }

    @GetMapping("/get")
    public Person get(@NotNull @RequestParam("perid") final Long personId) {
        return this.ps.get(personId);
    }


}
