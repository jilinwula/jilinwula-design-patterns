package com.jilinwula.patterns;

/**
 * 乘法工厂
 */
public class MultFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new MultOperation();
    }
}
