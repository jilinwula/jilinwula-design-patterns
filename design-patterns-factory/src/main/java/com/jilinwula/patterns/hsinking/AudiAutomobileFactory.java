package com.jilinwula.patterns.hsinking;

/**
 * 奥迪工厂类
 */
public class AudiAutomobileFactory implements AutomobileFactory {

    @Override
    public Automobile productionAutomobile() {
        return new AudiAutomobile();
    }
}
