package com.jilinwula.patterns;

public class VwCarSuv implements CarSuv {
    @Override
    public Car makeSuv() {
        return new Car("大众Suv");
    }
}
