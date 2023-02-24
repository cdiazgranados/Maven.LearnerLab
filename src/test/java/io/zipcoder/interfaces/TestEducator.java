package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation() {
        Educator educator = Educator.KRIS;
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Educator educator = Educator.RAZZ;
        Student student = new Student(1L, "Nick");
        educator.teach(student, 4.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 4.0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testLecture() {
        Educator educator = Educator.RAZZ;
        Student student = new Student(1L, "Nick");
        Student student1 = new Student(2L, "Carolina");
        Student[] students = {student, student1};
        educator.lecture(students, 10);
        Double actual = student.getTotalStudyTime();
        Double expected = 5.0;
        Assert.assertEquals(actual, expected);
    }
}
