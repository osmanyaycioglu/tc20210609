package com.training.micro.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.micro.dao.IPersonDAO;
import com.training.micro.rest.Person;

@Service
public class PersonStorage {

    // private final Map<Long, Person> personMap = new ConcurrentHashMap<>();

    @Autowired
    private IPersonDAO iPersonDAO;

    public void add(final Person person) {
        //        this.personMap.put(person.get PersonId(),
        //                           person);
        this.iPersonDAO.save(person);

    }

    public void change(final Person person) {
        //        this.personMap.put(person.getPersonId(),
        //                           person);
        this.iPersonDAO.save(person);
    }

    public Person get(final Long personId) {
        return this.iPersonDAO.findById(personId)
                              .orElse(null);

    }


}
