package com.training.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Runner {

    public static void main(final String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringtrainingApplication.class,
                                                                       args);
        //        Class<?> clzz = MyObject.class;
        //        TestMe testMeLoc = clzz.getAnnotation(TestMe.class);
        //        if (testMeLoc != null) {
        //            String testStrLoc = testMeLoc.testStr();
        //            int testValLoc = testMeLoc.testVal();
        //            System.out.println(" TestMe : " + testStrLoc + " " + testValLoc);
        //        }

        //        Speech speechLoc = new Speech();
        //        Language languageLoc = new Language(speechLoc);
        //        languageLoc.setSpeech(new Speech());
        //        languageLoc.xyz(new Speech());
        //        //languageLoc.setSpeech(speechLoc);
        //        languageLoc.talk();

        //        System.out.println("------------Spring way----------------");
        //        Language beanLoc = (Language) context.getBean("language");
        //        beanLoc.talk();


    }
}
