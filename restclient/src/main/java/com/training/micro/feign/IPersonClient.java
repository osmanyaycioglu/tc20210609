package com.training.micro.feign;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.micro.Person;

@FeignClient(value = "person", url = "http://127.0.0.1:9090")
@RequestMapping("/api/v2/person/provision")
public interface IPersonClient {

    @PostMapping("/add")
    public String add(@Validated @RequestBody final Person person) throws MyClientRestException;

    @PostMapping("/update")
    public String update(@Validated @RequestBody final Person person) throws MyClientRestException;

    @GetMapping("/get")
    public Person get(@NotNull @RequestParam("perid") final Long personId) throws MyClientRestException;
}
