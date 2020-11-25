package com.jilinwula.patterns.hsinking;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        MpvSuvFactory mpvSuvFactory = new BmwMpvSuvFactory();
        Mpv mpv = mpvSuvFactory.productionMpv();
        Suv suv = mpvSuvFactory.productionSuv();
        mpv.productionMpv();
        suv.productionSuv();
    }
}
