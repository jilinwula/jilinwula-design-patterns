package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        School school = new RequiredSubject();
        school = new ComputersOptionalSubject(new EnglishOptionalSubject(school));
        System.out.println(school.getOptionalCourse());
    }
}
