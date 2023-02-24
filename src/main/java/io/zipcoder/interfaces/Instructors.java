package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    public static final Instructors INSTRUCTORS = new Instructors();

    public Instructors() {
        this.add(new Instructor(1L, "Dolio"));
        this.add(new Instructor(2L, "Kris"));
    }


    public static Instructors getInstance() {
        return INSTRUCTORS;
    }

}
