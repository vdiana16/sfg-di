package guru.springframework.sfgdi.services;

public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via property!";
    }
}
