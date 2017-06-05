package kihon.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String greeting;
    private String name;

    public Person(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    private Person() {}

    public String getGreeting() {
        return String.format("%s from %s", greeting, name);
    }
}
