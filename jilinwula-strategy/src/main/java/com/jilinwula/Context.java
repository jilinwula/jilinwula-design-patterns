package com.jilinwula;

import lombok.Data;

public class Context {
    private Money money;

    public Context(Money money) {
        this.money = money;
    }

    public double calculateMoney(int price, int quantity) {
        return money.calculateMoney(price, quantity);
    }
}
