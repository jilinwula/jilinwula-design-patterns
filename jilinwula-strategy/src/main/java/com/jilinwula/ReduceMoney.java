package com.jilinwula;

public class ReduceMoney implements Money {
    @Override
    public double calculateMoney(int price, int quantity) {
        double money = price * quantity;
        if (money > 200) {
            money = money - 100;
        }
        return money;
    }
}
