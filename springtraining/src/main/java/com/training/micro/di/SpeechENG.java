package com.training.micro.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ENG")
@SpeechEnglish
//@Primary
//@Scope("prototype")
public class SpeechENG implements ISpeech {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye");
    }

}
