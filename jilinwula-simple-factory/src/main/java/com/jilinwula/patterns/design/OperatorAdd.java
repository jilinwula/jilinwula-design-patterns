package com.jilinwula.patterns.design;

public class OperatorAdd extends Operator {
    @Override
    public double returnResult() {
        return getOne() + getTwo();
    }
}
