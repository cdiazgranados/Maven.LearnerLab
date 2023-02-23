package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getInstance();

        Map<Student, Double> map = zcw.getStudyMap();
        int actual = zcw.getStudyMap().size();
        int expected = 9;
        Assert.assertEquals(actual, expected);
    }
}
