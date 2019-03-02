package com.jilinwula.patterns.design;

public class OperatorSubtract extends Operator {
    @Override
    public double returnResult() {
        return getOne() - getTwo();
    }
}
