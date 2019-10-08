package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        OrderMoney orderMoney = new OrderMoney(new FullDiscount(200, 100));
        double payAmount = orderMoney.payAmount(300);

        orderMoney = new OrderMoney(new RateDiscount(0.5));
        payAmount = orderMoney.payAmount(payAmount);

        System.out.println(payAmount);
    }
}
