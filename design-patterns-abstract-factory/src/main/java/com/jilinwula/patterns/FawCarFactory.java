package com.jilinwula.patterns;

/**
 * 一汽工厂
 */
public class FawCarFactory implements CarFactory {
    @Override
    public CarBus makeBus() {
        return new FawCarBus();
    }

    @Override
    public CarSuv makeSuv() {
        return new FawCarSuv();
    }
}
