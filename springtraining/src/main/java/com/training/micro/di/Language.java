package com.training.micro.di;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("dil")
public class Language {

    private final ISpeech speech;
    private ISpeech       speech2;
    @Autowired
    // @Qualifier("ENG")
    // @SpeechEnglish
    @Qualifier("DYNAMIC")
    private ISpeech       speech3;

    // @Autowired
    public Language(@Qualifier("TR") final ISpeech speechParam) {
        super();
        this.speech = speechParam;
    }


    @PostConstruct
    public void name() {
    }

    public void talk() {
        System.out.println("Instance 1 : " + this.speech);
        System.out.println("Instance 2 : " + this.speech2);
        System.out.println("Instance 3 : " + this.speech3);
        this.speech3.sayHello();
        this.speech3.sayGoodbye();
    }

    @Autowired
    public void xyz(@Qualifier("TR") final ISpeech speechParam) {
        this.speech2 = speechParam;
    }


    public ISpeech getSpeech2() {
        return this.speech2;
    }


    public void setSpeech2(final ISpeech speech2Param) {
        this.speech2 = speech2Param;
    }


    public ISpeech getSpeech3() {
        return this.speech3;
    }


    public void setSpeech3(final ISpeech speech3Param) {
        this.speech3 = speech3Param;
    }


    public ISpeech getSpeech() {
        return this.speech;
    }


}
