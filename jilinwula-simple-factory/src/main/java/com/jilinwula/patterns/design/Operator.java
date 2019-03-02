package com.jilinwula.patterns.design;

import lombok.Data;

@Data
public abstract class Operator {
    private double one;
    private double two;

    public abstract double returnResult();
}
