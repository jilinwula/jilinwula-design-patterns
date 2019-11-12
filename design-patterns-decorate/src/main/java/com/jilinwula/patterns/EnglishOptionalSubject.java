package com.jilinwula.patterns;

public class EnglishOptionalSubject extends OptionalSubject {

    public EnglishOptionalSubject(AbstractSchool abstractSchool) {
        super(abstractSchool);
    }

    public StringBuffer getOptionalCourse() {
        StringBuffer stringBuffer = abstractSchool.getOptionalCourse();
        stringBuffer.append("英语");
        return stringBuffer;
    }
}
