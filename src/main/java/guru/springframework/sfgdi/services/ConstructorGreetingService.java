package guru.springframework.sfgdi.services;

public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello - I was injected via the constructor!";
    }
}
