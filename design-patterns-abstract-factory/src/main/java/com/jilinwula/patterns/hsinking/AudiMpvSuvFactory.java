package com.jilinwula.patterns.hsinking;

/**
 * 奥迪Mpv&Suv类
 */
public class AudiMpvSuvFactory implements MpvSuvFactory {

    @Override
    public Mpv productionMpv() {
        return new AudiMpv();
    }

    @Override
    public Suv productionSuv() {
        return new AudiSuv();
    }
}
