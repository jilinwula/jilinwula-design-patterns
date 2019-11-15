package com.jilinwula.patterns;

/**
 * 一汽工厂
 */
public class FawFactory {

    /**
     * 创建汽车
     *
     * @param builder
     */
    public void createCar(AbstractCarBuilder builder) {
        builder.builderEngine();
        builder.builderWheel();
        builder.builderBody();
        builder.builderLogo();
    }
}
