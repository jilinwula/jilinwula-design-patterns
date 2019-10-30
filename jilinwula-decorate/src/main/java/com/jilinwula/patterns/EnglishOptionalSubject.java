package com.jilinwula.patterns;

public class EnglishOptionalSubject extends OptionalSubject {

    public EnglishOptionalSubject(School school) {
        super(school);
    }

    public StringBuffer getOptionalCourse() {
        StringBuffer stringBuffer = school.getOptionalCourse();
        stringBuffer.append("英语");
        return stringBuffer;
    }
}
