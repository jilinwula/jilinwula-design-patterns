package com.jilinwula.patterns;

public class HongQiBus implements BusCar {
    @Override
    public Car makeBus() {
        return new Car("红旗BUS");
    }
}
