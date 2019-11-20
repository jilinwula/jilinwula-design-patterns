package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        Voltage5 voltage5 = new VoltageAdapter();
        System.out.println(voltage5.electricity());
    }
}
