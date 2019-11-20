package com.jilinwula.patterns;

import lombok.Data;

@Data
public class Voltage {
    private String voltage;

    public Voltage(String voltage) {
        this.voltage = voltage;
    }
}
