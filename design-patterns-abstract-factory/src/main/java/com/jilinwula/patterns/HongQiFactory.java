package com.jilinwula.patterns;

/**
 * 红旗SVU
 */
public class HongQiFactory implements CarFactory {

    @Override
    public Car makeBus() {
        return new HongQiBus().makeBus();
    }

    @Override
    public Car makeSuv() {
        return new HongQiSuv().makeSuv();
    }
}
