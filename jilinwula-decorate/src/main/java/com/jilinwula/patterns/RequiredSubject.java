package com.jilinwula.patterns;

public class RequiredSubject extends AbstractSchool {

    public StringBuffer getOptionalCourse() {
        StringBuffer StringBuffer = new StringBuffer();
        StringBuffer.append("数学");
        StringBuffer.append("语文");
        StringBuffer.append("外语");
        return StringBuffer;
    }
}
