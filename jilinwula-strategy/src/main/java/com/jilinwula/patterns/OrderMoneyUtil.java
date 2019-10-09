package com.jilinwula.patterns;

/**
 * 订单金额
 */
public class OrderMoneyUtil {

    private AbstractDiscount abstractDiscount;

    public OrderMoneyUtil(AbstractDiscount abstractDiscount) {
        this.abstractDiscount = abstractDiscount;
    }

    public double payAmount(double orderPrice) {
        return abstractDiscount.payAmount(orderPrice);
    }
}
