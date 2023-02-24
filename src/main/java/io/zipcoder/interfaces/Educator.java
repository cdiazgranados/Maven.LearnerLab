package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    KRIS(1L, "Kris"),
    DOLIO(2L, "Dolio"),

    RAZZ(3L, "Razz");

    Double timeWorked = 0.0;
    Instructor instructor;

    Educator(Long id, String name) {
        instructor = new Instructor(id, name);
        Instructors.getInstance().add(new Instructor(id, name));
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
