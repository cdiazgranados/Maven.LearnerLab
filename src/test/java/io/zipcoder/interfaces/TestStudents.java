package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestStudents {
    @Test
    public void testInstance() {
        for (Student student: Students.getInstance()) {
            System.out.println(student.getName());
        }
       int actual = Students.getInstance().count();
       int expected = 9;
       Assert.assertEquals(actual, expected);
    }
}
