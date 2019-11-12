package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        OperationFactory operationFactory = new SubFactory();

        Operation operation = operationFactory.createOperation();

        operation.setA(1);
        operation.setB(2);

        System.out.println(operation.getResult());
    }
}
