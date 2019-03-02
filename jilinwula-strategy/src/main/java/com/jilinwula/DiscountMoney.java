package com.jilinwula;

public class DiscountMoney implements Money {
    @Override
    public double calculateMoney(int price, int quantity) {
        double money = price * quantity;
        return money * 0.8;
    }
}
