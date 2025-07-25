package guru.springframework.sfgdi.services;

//@Primary
//@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I am the PRIMARY Bean!";
    }
}
