package com.jilinwula.patterns;

public class ComputersOptionalSubject extends OptionalSubject {

    public ComputersOptionalSubject(School school) {
        super(school);
    }

    public StringBuffer getOptionalCourse() {
        StringBuffer stringBuffer = school.getOptionalCourse();
        stringBuffer.append("计算机");
        return stringBuffer;
    }
}
