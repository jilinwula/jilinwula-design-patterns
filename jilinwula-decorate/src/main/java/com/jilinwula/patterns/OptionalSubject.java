package com.jilinwula.patterns;

public class OptionalSubject extends AbstractSchool {
    protected AbstractSchool abstractSchool;

    public OptionalSubject(AbstractSchool abstractSchool) {
        this.abstractSchool = abstractSchool;
    }

    public StringBuffer getOptionalCourse() {
        return abstractSchool.getOptionalCourse();
    }
}
