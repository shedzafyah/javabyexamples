package com.javabyexamples.spring.core.usingbean.beandependencies;

public class DefaultGreetingService implements GreetingService {

    private final GreetingProperties greetingProperties;

    public DefaultGreetingService(GreetingProperties greetingProperties) {
        this.greetingProperties = greetingProperties;
    }

    @Override
    public void greet() {
        System.out.println(greetingProperties.getGreeting());
    }
}
