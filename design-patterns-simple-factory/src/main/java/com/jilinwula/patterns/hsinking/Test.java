package com.jilinwula.patterns.hsinking;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        AutomobileFactory automobileFactory = new AutomobileFactory();
        Automobile automobile = automobileFactory.productionAutomobile(BmwAutomobile.class);
        automobile.productionAutomobile();
    }
}
