package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        FawFactory fawFactory = new FawFactory();

        HongQiCarBuilder hongQiCarBuilder = new HongQiCarBuilder();
        BenTengCarBuilder benTengCarBuilder = new BenTengCarBuilder();

        fawFactory.createCar(hongQiCarBuilder);
        Car hongqi = hongQiCarBuilder.getCar();
        System.out.println(hongqi);

        fawFactory.createCar(benTengCarBuilder);
        Car benteng = benTengCarBuilder.getCar();
        System.out.println(benteng);
    }
}
