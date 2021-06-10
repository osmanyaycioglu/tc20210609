package com.training.micro.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingRest {

    @GetMapping("/hello/{xyz}/{abc}/age/{asd}")
    public String hello(@PathVariable("xyz") final String name,
                        @PathVariable("abc") final String surname,
                        @PathVariable("asd") final int age) {
        return "Hello " + name + " " + surname + " " + age;
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam("xyz") final String name,
                         @RequestParam("abc") final String surname,
                         @RequestParam("asd") final int age) {
        return "Hello2 " + name + " " + surname + " " + age;
    }

    //    @GetMapping("/exec/{komut}")
    //    public ResponseEntity<?> exec(@RequestParam("komut") final String komut,
    //                       final HttpServletRequest hsp) {
    //        switch (komut) {
    //            case "exec1":
    //                return ResponseEntity.status(200).body("ok");
    //            case "exec2":
    //                return ResponseEntity.status(200).body(100);
    //            case "exec3":
    //                return ResponseEntity.status(200).body(100);
    //
    //            default:
    //                break;
    //        }
    //        return ResponseEntity.status(200).body(100);
    //    }

    @GetMapping("/hello3")
    public String hello3(@RequestHeader("xyz") final String name,
                         @RequestHeader("abc") final String surname,
                         @RequestHeader("asd") final int age) {
        return "Hello3 " + name + " " + surname + " " + age;
    }

    @PostMapping("/hello4")
    public String hello4(@RequestBody final Person person) {
        return "Hello4 " + person;
    }

    @PostMapping("/hello5")
    public Person hello5(@RequestBody final Person person) {
        person.setName("ali");
        return person;
    }

}
