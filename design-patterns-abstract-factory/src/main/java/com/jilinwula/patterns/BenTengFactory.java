package com.jilinwula.patterns;

/**
 * 奔腾SVU
 */
public class BenTengFactory implements CarFactory {

    @Override
    public Car makeBus() {
        return new BenTengBus().makeBus();
    }

    @Override
    public Car makeSuv() {
        return new BenTengSuv().makeSuv();
    }
}
