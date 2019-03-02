package com.jilinwula;

public class NormalMoney implements Money {
    @Override
    public double calculateMoney(int price, int quantity) {
        int money = price * quantity;
        return money;
    }
}
