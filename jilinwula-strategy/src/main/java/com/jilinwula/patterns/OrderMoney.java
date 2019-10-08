package com.jilinwula.patterns;

/**
 * 订单金额
 */
public class OrderMoney {

    private AbstractDiscount abstractDiscount;

    public OrderMoney(AbstractDiscount abstractDiscount) {
        this.abstractDiscount = abstractDiscount;
    }

    public double payAmount(double orderPrice) {
        return abstractDiscount.payAmount(orderPrice);
    }
}
