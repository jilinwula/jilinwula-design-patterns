package com.jilinwula.patterns.design;

public class OperatorDivide extends Operator {
    @Override
    public double returnResult() {
        return getOne() / getTwo();
    }
}
