package com.jilinwula.patterns;

/**
 * 奔腾车建造类
 */
public class BenTengCarBuilder extends AbstractCarBuilder {

    private Car car = new Car();

    @Override
    public void builderEngine() {
        car.setEngine("奔腾发动机");
    }

    @Override
    public void builderWheel() {
        car.setWheel("奔腾轮胎");
    }

    @Override
    public void builderBody() {
        car.setBody("奔腾车身");
    }

    @Override
    public void builderLogo() {
        car.setLogo("奔腾");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
