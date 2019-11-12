package com.jilinwula.patterns;

/**
 * 简单工厂类
 */
public class SimpleFactory {
    public static AbstractOperation createOperation(String symbol) {
        AbstractOperation operation = null;
        switch (symbol) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MultOperation();
                break;
            case "/":
                operation = new DivideOperation();
                break;
        }
        return operation;
    }
}
