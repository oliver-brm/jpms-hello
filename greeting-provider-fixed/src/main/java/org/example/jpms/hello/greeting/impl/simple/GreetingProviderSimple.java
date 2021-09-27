package org.example.jpms.hello.greeting.impl.simple;

import org.example.jpms.hello.greeting.GreetingService;

public class GreetingProviderSimple implements GreetingService {

    @Override
    public String greet(String name) {
        return String.format("Hello %s", name);
    }
}
