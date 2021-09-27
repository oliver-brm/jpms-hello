package org.example.jpms.hello.greeting;

/**
 * A service that can produce greetings.
 */
public interface GreetingService {

    /**
     * Produces and returns a greeting for the given {@code name}.
     * @param name the name to greet
     * @return the greeting
     */
    String greet(String name);

}
