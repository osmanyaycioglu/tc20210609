package com.training.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.micro.di.Language;

//@Controller
//@Repository
//@Service
//@Configuration


@SpringBootApplication
public class SpringtrainingApplication implements ApplicationRunner {

    @Autowired
    private Language lng;

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        this.lng.talk();
    }


}
