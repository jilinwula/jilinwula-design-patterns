package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        AbstractSchool abstractSchool = new RequiredSubject();
        abstractSchool = new ComputersOptionalSubject(new EnglishOptionalSubject(abstractSchool));
        System.out.println(abstractSchool.getOptionalCourse());
    }
}
