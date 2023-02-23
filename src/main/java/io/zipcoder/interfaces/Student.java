package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private double totalStudyTime = 0;
    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
