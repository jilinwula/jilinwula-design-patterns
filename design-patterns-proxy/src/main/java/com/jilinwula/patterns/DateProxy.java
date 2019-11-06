package com.jilinwula.patterns;

import java.text.SimpleDateFormat;

public class DateProxy implements FormatDate {

    private Dateinfo dateinfo;

    public DateProxy(Dateinfo dateinfo) {
        this.dateinfo = dateinfo;
    }

    @Override
    public Object ymd() {
        return new SimpleDateFormat("yyyy-MM-dd").format(dateinfo.getDate());
    }

    @Override
    public Object ymdhms() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dateinfo.getDate());
    }
}
