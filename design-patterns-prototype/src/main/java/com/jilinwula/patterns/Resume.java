package com.jilinwula.patterns;

import lombok.Data;

@Data
public class Resume extends AbstractResume implements Cloneable {

    public Resume(String name, int age) {
        super(name, age);
    }

    @Override
    public Object copy() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}
