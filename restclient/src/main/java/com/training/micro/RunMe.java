package com.training.micro;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.training.micro.feign.IPersonClient;
import com.training.micro.feign.MyClientRestException;

@Component
public class RunMe implements CommandLineRunner {

    @Autowired
    private IPersonClient pc;

    private final long    counter = 2;

    @Scheduled(fixedDelay = 10_000, initialDelay = 3_000)
    public void testFeign() {
        try {
            Person personLoc = this.pc.get(1L);
            System.out.println("Feign : " + personLoc);
        } catch (MyClientRestException eLoc) {
            System.out.println("Rest client GET Error : " + eLoc.getErrorObj());
        }

        Person person = new Person();
        person.setName("osman" + this.counter);
        person.setSurname("yay" + this.counter);
        //        person.setBirthday(LocalDate.now()
        //                                       .minusDays(100));
        person.setGender(EGender.MALE);
        person.setPersonId(this.counter);
        person.setHeight(200);

        try {
            String addLoc = this.pc.add(person);
            System.out.println("Feign result : " + addLoc);
        } catch (MyClientRestException eLoc) {
            System.out.println("Rest client ADD Error : " + eLoc.getErrorObj());
        }
    }


    @Override
    public void run(final String... argsParam) throws Exception {
        RestTemplate restTemplateLoc = new RestTemplate();
        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yay");
        personLoc.setBirthday(LocalDate.now()
                                       .minusDays(100));
        personLoc.setGender(EGender.MALE);
        personLoc.setPersonId(1L);
        personLoc.setHeight(200);
        String postForObjectLoc = restTemplateLoc.postForObject("http://127.0.0.1:9090/api/v2/person/provision/add",
                                                                personLoc,
                                                                String.class);
        System.out.println("Result : " + postForObjectLoc);

        Person forObjectLoc = restTemplateLoc.getForObject("http://127.0.0.1:9090/api/v2/person/provision/get?perid=1",
                                                           Person.class);
        System.out.println("GET Result : " + forObjectLoc);
    }

}
