package com.training.micro.data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.training.micro.rest.Person;

@Service
public class PersonStorage {

    private final Map<Long, Person> personMap = new ConcurrentHashMap<>();


    public void add(final Person person) {
        this.personMap.put(person.getPersonId(),
                           person);
    }

    public void change(final Person person) {
        this.personMap.put(person.getPersonId(),
                           person);
    }

    public Person get(final Long personId) {
        return this.personMap.get(personId);
    }


}
