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

    public Person(String greeting) {
        this.greeting = greeting;
    }

    private Person() {}

    public long getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }
}
