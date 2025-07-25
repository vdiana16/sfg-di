package guru.springframework.sfgdi.services;

//@Profile({"ES", "default"})
//@Service("i18nService")
public class I18nSpanishService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola mundo";
    }
}
