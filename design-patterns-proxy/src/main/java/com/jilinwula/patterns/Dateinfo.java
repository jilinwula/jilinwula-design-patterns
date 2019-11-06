package com.jilinwula.patterns;

import java.util.Date;

public class Dateinfo implements FormatDate {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public Object ymd() {
        return null;
    }

    @Override
    public Object ymdhms() {
        return null;
    }
}
