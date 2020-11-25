package com.jilinwula.patterns.hsinking;

/**
 * 宝马工厂类
 */
public class BmwAutomobileFactory implements AutomobileFactory {
    @Override
    public Automobile productionAutomobile() {
        return new BmwAutomobile();
    }
}
