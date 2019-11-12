package com.jilinwula.patterns;

/**
 * 除法工厂
 */
public class DivideFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new DivideOperation();
    }
}
