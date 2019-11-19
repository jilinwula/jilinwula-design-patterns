package com.jilinwula.patterns;

public class VwCarBus implements CarBus {
    @Override
    public Car makeBus() {
        return new Car("大众Bus");
    }
}
