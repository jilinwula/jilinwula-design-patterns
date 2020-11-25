package com.jilinwula.patterns.hsinking;

/**
 * 奔驰Mpv&Suv类
 */
public class BenzMpvSuvFactory implements MpvSuvFactory {

    @Override
    public Mpv productionMpv() {
        return new BenzMpv();
    }

    @Override
    public Suv productionSuv() {
        return new BenzSuv();
    }
}
