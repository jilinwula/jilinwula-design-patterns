package com.jilinwula.patterns;

/**
 * 汽车工厂
 */
public interface CarFactory {
    CarBus makeBus();

    CarSuv makeSuv();
}
