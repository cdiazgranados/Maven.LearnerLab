package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstance(){
        for (Instructor instructor: Instructors.getInstance()) {
            System.out.println(instructor.getName());
        }
        int actual = Instructors.getInstance().count();
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }
}
