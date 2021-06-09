package com.training.micro.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.training.micro.config.SpeechConfig;

import a.b.c.MyLibAConfig;

@Configuration
@Import(MyLibAConfig.class)
@PropertySource("classpath:newprop.properties")
public class LangConfig {

    @Autowired
    private Environment  env;

    @Value("${speech.language}")
    private String       lang;

    @Autowired
    private SpeechConfig sc;

    @Value("#{speechConfig.getLanguage()}")
    private String       langFromConfigBean;

    @Bean
    @Qualifier("DYNAMIC")
    public ISpeech spCreate() {
        System.out.println(this.sc);
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

    //    @Bean
    //    @Qualifier("DYNAMIC")
    //    public ISpeech spCreate() {
    //        System.out.println(this.sc);
    //        switch (this.sc.getLanguage()) {
    //            case "eng":
    //                return new SpeechENG();
    //            case "tr":
    //                return new SpeechTR();
    //            case "esp":
    //                return new SpeechESP();
    //            default:
    //                return new SpeechENG();
    //        }
    //    }

    //    @Bean
    //    @Qualifier("DYNAMIC")
    //    public ISpeech spCreate() {
    //        switch (this.lang) {
    //            case "eng":
    //                return new SpeechENG();
    //            case "tr":
    //                return new SpeechTR();
    //            case "esp":
    //                return new SpeechESP();
    //            default:
    //                return new SpeechENG();
    //        }
    //    }

    //    @Bean
    //    @Qualifier("DYNAMIC")
    //    public ISpeech spCreate() {
    //        String propertyLoc = this.env.getProperty("speech.language");
    //        switch (propertyLoc) {
    //            case "eng":
    //                return new SpeechENG();
    //            case "tr":
    //                return new SpeechTR();
    //            case "esp":
    //                return new SpeechESP();
    //            default:
    //                return new SpeechENG();
    //        }
    //    }

}

