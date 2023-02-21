package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructorName(){
        Person person = new Person(123L, "Nick");
        String expected = "Nick";
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorId(){
        Person person = new Person(123L, "Nick");
        Long expected = 123L;
        Long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        Person person = new Person(123L, "Nick");
        person.setName("Carolina");
        String expected = "Carolina";
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

}
