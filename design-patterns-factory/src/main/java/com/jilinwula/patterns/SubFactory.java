package com.jilinwula.patterns;

/**
 * 减法工厂
 */
public class SubFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
