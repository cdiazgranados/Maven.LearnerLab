package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        Student student = new Student(123L, "Nick");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(123L, "Carolina");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(123L, "Carolina");
        student.learn(3);
        Double expected = 3.0;
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }
}
