module org.example.jpms.hello.greeting.provider.fixed {
    requires org.example.jpms.hello.greeting.service;
    provides org.example.jpms.hello.greeting.GreetingService
            with org.example.jpms.hello.greeting.impl.simple.GreetingProviderSimple;
}