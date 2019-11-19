package com.jilinwula.patterns;

public class FawCarSuv implements CarSuv {
    @Override
    public Car makeSuv() {
        return new Car("一汽Suv");
    }
}
