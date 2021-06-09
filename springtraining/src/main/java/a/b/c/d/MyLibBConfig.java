package a.b.c.d;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibBConfig {

    @Bean
    public MySecondary mySecondary() {
        return new MySecondary();
    }

}
