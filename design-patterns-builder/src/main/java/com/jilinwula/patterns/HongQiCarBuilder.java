package com.jilinwula.patterns;

/**
 * 红旗车建造类
 */
public class HongQiCarBuilder extends AbstractCarBuilder {

    private Car car = new Car();

    @Override
    public void builderEngine() {
        car.setEngine("红旗发动机");
    }

    @Override
    public void builderWheel() {
        car.setWheel("红旗轮胎");
    }

    @Override
    public void builderBody() {
        car.setBody("红旗车身");
    }

    @Override
    public void builderLogo() {
        car.setLogo("红旗");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
