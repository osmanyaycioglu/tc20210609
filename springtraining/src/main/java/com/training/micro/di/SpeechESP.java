package com.training.micro.di;

public class SpeechESP implements ISpeech {

    @Override
    public void sayHello() {
        System.out.println("Ola");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Adios");
    }

}
