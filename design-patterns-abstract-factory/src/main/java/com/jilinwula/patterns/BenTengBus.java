package com.jilinwula.patterns;

public class BenTengBus implements BusCar {
    @Override
    public Car makeBus() {
        return new Car("奔腾BUS");
    }
}
