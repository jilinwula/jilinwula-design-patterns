package com.jilinwula.patterns;

public class ComputersOptionalSubject extends OptionalSubject {

    public ComputersOptionalSubject(AbstractSchool abstractSchool) {
        super(abstractSchool);
    }

    public StringBuffer getOptionalCourse() {
        StringBuffer stringBuffer = abstractSchool.getOptionalCourse();
        stringBuffer.append("计算机");
        return stringBuffer;
    }
}
