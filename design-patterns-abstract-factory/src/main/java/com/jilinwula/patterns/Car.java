package com.jilinwula.patterns;

import lombok.Data;

@Data
public class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }
}
