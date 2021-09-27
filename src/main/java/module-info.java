module org.example.jpms.hello.main {

    requires org.example.jpms.hello.greeting.service;
    uses org.example.jpms.hello.greeting.GreetingService;

}