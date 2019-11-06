package com.jilinwula.patterns;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Dateinfo dateinfo = new Dateinfo();
        dateinfo.setDate(new Date());

        System.out.println(dateinfo.getDate());
        System.out.println(dateinfo.ymd());
        System.out.println(dateinfo.ymdhms());

        DateProxy dateProxy = new DateProxy(dateinfo);
        System.out.println(dateProxy.ymd());
        System.out.println(dateProxy.ymdhms());
    }
}
