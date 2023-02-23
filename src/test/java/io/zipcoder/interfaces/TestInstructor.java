package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(123L, "Carolina");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(123L, "Carolina");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(123L, "Carolina");
        Student student = new Student(123L, "Hugo");
        instructor.teach(student, 3);
        Double expected = 3.0;
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(123L, "Carolina");
        Student student1 = new Student(123L, "Hugo");
        Student student2 = new Student(123L, "Hugo");
        Student student3 = new Student(123L, "Hugo");
        Learner[] learners = {student1, student2, student3};
        instructor.lecture(learners, 3);
        Double expected = 1.0;
        Double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }
}
