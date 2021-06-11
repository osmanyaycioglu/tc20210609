package com.training.micro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.micro.rest.Person;

// @Repository
public interface IPersonDAO extends CrudRepository<Person, Long> {

    List<Person> findByName(String name);

    List<Person> findByNameAndSurnameOrderByNameAsc(String name,
                                                    String surname);

    @Query("select p from Person p where p.name=:name")
    List<Person> searchName(@Param("name") String name);

    @Query(value = "select * from kisi where isim=:name", nativeQuery = true)
    List<Person> searchNameNative(@Param("name") String name);


}
