package com.jilinwula.patterns.hsinking;

/**
 * 宝马Mpv&Suv类
 */
public class BmwMpvSuvFactory implements MpvSuvFactory {

    @Override
    public Mpv productionMpv() {
        return new BenzMpv();
    }

    @Override
    public Suv productionSuv() {
        return new BenzSuv();
    }
}
