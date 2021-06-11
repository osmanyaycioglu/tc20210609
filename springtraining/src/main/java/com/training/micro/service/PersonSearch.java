package com.training.micro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.micro.dao.IPersonDAO;
import com.training.micro.rest.Person;

@Service
public class PersonSearch {

    @Autowired
    private IPersonDAO iPersonDAO;

    public List<Person> searchByName(final String name) {
        return this.iPersonDAO.findByName(name);
    }

}
