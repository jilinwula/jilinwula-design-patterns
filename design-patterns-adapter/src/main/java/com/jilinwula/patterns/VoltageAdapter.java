package com.jilinwula.patterns;

public class VoltageAdapter implements Voltage5 {

    private Voltage220 voltage220 = new Voltage220();

    public Voltage electricity() {
        Voltage voltage = voltage220.electricity();
        voltage.setVoltage("5V");
        return voltage;
    }
}
