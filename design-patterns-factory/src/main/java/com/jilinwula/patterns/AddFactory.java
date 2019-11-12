package com.jilinwula.patterns;

/**
 * 加法工厂
 */
public class AddFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
