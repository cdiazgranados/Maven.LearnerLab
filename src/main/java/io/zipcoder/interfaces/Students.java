package io.zipcoder.interfaces;

import java.util.List;

public final class Students extends People<Student> {
    public static final Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(1L ,"Andrew"));
        this.add(new Student(2L ,"Anna"));
        this.add(new Student(3L ,"Calvin"));
        this.add(new Student(4L ,"Carolina"));
        this.add(new Student(5L ,"Collin"));
        this.add(new Student(6L ,"Dan"));
        this.add(new Student(7L ,"Elijah"));
        this.add(new Student(8L ,"Eryk"));
        this.add(new Student(9L ,"Emory"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getArray() {
        return (Student[]) this.toArray(new Student[0]);
    }
}
