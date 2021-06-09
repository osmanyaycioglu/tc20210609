package com.training.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.micro.di.Language;

import a.b.c.MyOther;

//@Controller
//@Repository
//@Service
//@Configuration

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {
//                                            "com.training.micro",
//                                            "a.b.c"
//})
public class SpringtrainingApplication implements ApplicationRunner {

    @Autowired
    private Language lng;

    @Autowired
    private MyOther  mo;

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        this.mo.hello();
        this.lng.talk();
    }


}
