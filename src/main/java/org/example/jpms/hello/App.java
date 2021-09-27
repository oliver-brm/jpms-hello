package org.example.jpms.hello;

import org.example.jpms.hello.greeting.GreetingService;

import java.util.ServiceLoader;

public class App {

    public static void main(String[] args) {
        ServiceLoader<GreetingService> greetingLoader = ServiceLoader.load(GreetingService.class);
        final var greeting = greetingLoader.findFirst().orElseThrow().greet("Sir!");
        System.out.println(greeting);
    }

}
