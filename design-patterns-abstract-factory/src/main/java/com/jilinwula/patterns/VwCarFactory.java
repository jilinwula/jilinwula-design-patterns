package com.jilinwula.patterns;

/**
 * 大众工厂
 */
public class VwCarFactory implements CarFactory {
    @Override
    public CarBus makeBus() {
        return new VwCarBus();
    }

    @Override
    public CarSuv makeSuv() {
        return new VwCarSuv();
    }
}
