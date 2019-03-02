package com.jilinwula;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new ReduceMoney());
        System.out.println(context.calculateMoney(110, 2));
    }
}
