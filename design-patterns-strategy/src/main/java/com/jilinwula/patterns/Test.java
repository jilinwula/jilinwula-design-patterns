package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        OrderMoneyUtil orderMoney = new OrderMoneyUtil(new FullDiscount(200, 100));
        double payAmount = orderMoney.payAmount(300);

        orderMoney = new OrderMoneyUtil(new RateDiscount(0.5));
        payAmount = orderMoney.payAmount(payAmount);

        System.out.println(payAmount);
    }
}
