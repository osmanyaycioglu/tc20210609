package a.b.c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibAConfig {

    @Bean
    public MyOther myOther() {
        return new MyOther();
    }

}
