package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new BenTengFactory();
        Car suv = carFactory.makeSuv();
        System.out.println(suv);

        Car bus = carFactory.makeBus();
        System.out.println(bus);
    }
}
