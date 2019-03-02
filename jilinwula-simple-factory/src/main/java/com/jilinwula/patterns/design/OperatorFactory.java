package com.jilinwula.patterns.design;

public abstract class OperatorFactory {

    public static Operator createOperator(String operator) {
        Operator o = null;
        switch (operator) {
            case "+":
                o = new OperatorAdd();
            case "-":
                o = new OperatorAdd();
                break;
            case "*":
                o = new OperatorAdd();
                break;
            case "/":
                o = new OperatorAdd();
                break;
        }
        return o;
    }
}
