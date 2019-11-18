package com.jilinwula.patterns;

public class BenTengSuv implements SuvCar {
    @Override
    public Car makeSuv() {
        return new Car("奔腾SUV");
    }
}
