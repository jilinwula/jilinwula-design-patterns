package com.jilinwula.patterns;

public class HongQiSuv implements SuvCar {
    @Override
    public Car makeSuv() {
        return new Car("红旗SUV");
    }
}
