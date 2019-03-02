package com.jilinwula.patterns.design;

public class OperatorMultiply extends Operator {
    @Override
    public double returnResult() {
        return getOne() * getTwo();
    }
}
