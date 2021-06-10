package com.training.micro.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import a.b.c.MyLibAConfig;

@Configuration
@Import(MyLibAConfig.class)
@PropertySource("classpath:newprop.properties")
@Profile("live")
public class LangConfig2 {

    @Value("#{speechConfig.getLanguage()}")
    private String langFromConfigBean;

    @Bean
    @Qualifier("DYNAMIC")
    public ISpeech spCreate() {
        System.out.println("LIVE CONFIG...");
        switch (this.langFromConfigBean) {
            case "eng":
                return new SpeechENG();
            case "tr":
                return new SpeechTR();
            case "esp":
                return new SpeechESP();
            default:
                return new SpeechENG();
        }
    }

}

