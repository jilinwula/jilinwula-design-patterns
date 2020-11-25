package com.jilinwula.patterns.hsinking;

/**
 * Mpv&Suv工厂类
 */
public interface MpvSuvFactory {
    /**
     * 生产Mpv
     * @return
     */
    Mpv productionMpv();

    /**
     * 生产Suv
     * @return
     */
    Suv productionSuv();
}
