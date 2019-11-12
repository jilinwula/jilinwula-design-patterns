package com.jilinwula.patterns;

/**
 * 没有折扣
 */
public class NoneDiscount extends AbstractDiscount {
    public double payAmount(double orderPrice) {
        return orderPrice;
    }
}
