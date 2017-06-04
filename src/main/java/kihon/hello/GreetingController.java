package kihon.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Optional;

@Controller
public class GreetingController {

    private final PersonRepository personRepository;

    @PostConstruct
    public void init() {
        Arrays.asList(new Person("Hi"),
                new Person("Hello"),
                new Person("Hola"))
                .stream()
                .forEach(personRepository::save);
    }

    @Autowired
    public GreetingController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping(value = "/greeting/{userId}", method = RequestMethod.GET)
    public ModelAndView greeting(@PathVariable(value = "userId") Long userId) {
        Person person = personRepository.findOne(userId);
        String greeting = person == null ? "Whazzzuppp" : person.getGreeting();
        ModelAndView view = new ModelAndView("greeting/index");
        view.addObject("greeting", greeting);
        return view;
    }
}
