package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd() {
        People people = new People();
        Person person = new Person(123L, "Carolina");
        people.add(person);
        Integer expected = 1;
        Integer actual = people.count();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        People people = new People();
        Person person = new Person(123L, "Carolina");
        people.add(person);
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testFindById() {
        People people = new People();
        Person person = new Person(123L, "Carolina");
        people.add(person);
        Person actual = people.findById(123L);
        Assert.assertEquals(person, actual);
    }

    @Test
    public void testRemove() {
        People people = new People();
        Person person = new Person(123L, "Carolina");
        people.add(person);
        people.remove(person);
        Assert.assertFalse(people.contains(person));
    }

    @Test
    public void testRemoveAll( ) {
        People people = new People();
        Person person = new Person(123L, "Carolina");
        Person person2 = new Person(124L, "Nick");
        people.add(person);
        people.add(person2);
        people.removeAll();
        Integer expected = 0;
        Integer actual = people.count();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToArray() {
        People people = new People();
        Person person = new Person(123L, "Carolina");
        Person person2 = new Person(124L, "Nick");
        people.add(person);
        people.add(person2);
        Person[] expected = {person, person2};
        Person[] actual = people.toArray(new Student[0]);
        Assert.assertArrayEquals(expected, actual);
    }
}
