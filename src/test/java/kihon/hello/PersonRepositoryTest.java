package kihon.hello;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PersonRepositoryTest {

    @Test
    public void shouldIncludeNameOnGreeting() {
        Person naruto = new Person("Naruto", "Aisatsu");
        assertThat(naruto.getGreeting(), is("Aisatsu from Naruto"));
    }
}