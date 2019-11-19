package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new FawCarFactory();
        CarSuv carSuv = carFactory.makeSuv();
        System.out.println(carSuv.makeSuv());

        CarBus carBus = carFactory.makeBus();
        System.out.println(carBus.makeBus());
    }
}
