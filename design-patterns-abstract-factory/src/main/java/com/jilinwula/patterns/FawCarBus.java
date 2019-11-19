package com.jilinwula.patterns;

public class FawCarBus implements CarBus {
    @Override
    public Car makeBus() {
        return new Car("一汽Bus");
    }
}
