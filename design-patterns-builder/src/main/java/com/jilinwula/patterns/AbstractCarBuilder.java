package com.jilinwula.patterns;

/**
 * 抽象建造者类
 */
public abstract class AbstractCarBuilder {

    /**
     * 建造发动机
     */
    public abstract void builderEngine();

    /**
     * 建造轮子
     */
    public abstract void builderWheel();

    /**
     * 建造车身
     */
    public abstract void builderBody();

    /**
     * 建造牌子
     */
    public abstract void builderLogo();

    /**
     * 获得car信息
     *
     * @return
     */
    public abstract Car getCar();
}
