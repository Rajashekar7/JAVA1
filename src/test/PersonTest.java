package test;

import main.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testNameConcat(){
        Person p = new Person("Raj", "Reddy");
        String f = p.getFullName();
        assertEquals("Name concatination", "Raj Reddy", f);
    }
}
