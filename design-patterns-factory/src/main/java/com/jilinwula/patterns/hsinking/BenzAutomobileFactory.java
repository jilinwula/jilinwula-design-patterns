package com.jilinwula.patterns.hsinking;

/**
 * 奔驰工厂类
 */
public class BenzAutomobileFactory implements AutomobileFactory {
    @Override
    public Automobile productionAutomobile() {
        return new BenzAutomobile();
    }
}
