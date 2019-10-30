package com.jilinwula.patterns;

public class OptionalSubject extends School {
    protected School school;

    public OptionalSubject(School school) {
        this.school = school;
    }

    public StringBuffer getOptionalCourse() {
        return school.getOptionalCourse();
    }
}
