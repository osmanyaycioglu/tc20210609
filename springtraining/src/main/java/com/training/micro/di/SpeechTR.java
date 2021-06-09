package com.training.micro.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TR")
@SpeechTurkish
public class SpeechTR implements ISpeech {

    @Override
    public void sayHello() {
        System.out.println("Merhaba");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Güle güle");
    }

}
