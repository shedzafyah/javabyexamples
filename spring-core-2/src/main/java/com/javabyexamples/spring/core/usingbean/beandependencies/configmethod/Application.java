package com.javabyexamples.spring.core.usingbean.beandependencies.configmethod;

import com.javabyexamples.spring.core.usingbean.beandependencies.GreetingService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
          new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        applicationContext.getBean(GreetingService.class).greet();

        applicationContext.close();
    }
}
