package com.jilinwula.patterns;

import lombok.Data;
import lombok.ToString;

@Data
public abstract class AbstractResume {
    protected String name;
    protected int age;
    protected Work work;

    public AbstractResume(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract Object copy() throws CloneNotSupportedException;

}
