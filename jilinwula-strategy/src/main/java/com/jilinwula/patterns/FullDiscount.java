package com.jilinwula.patterns;

import lombok.Data;

/**
 * 满减折扣
 */
@Data
public class FullDiscount extends AbstractDiscount {

    /**
     * 满多少钱
     */
    private double full;

    /**
     * 减多少钱
     */
    private double discount;

    public FullDiscount(double full, double discount) {
        this.full = full;
        this.discount = discount;
    }

    public double payAmount(double orderPrice) {
        return orderPrice >= full ? orderPrice - discount : orderPrice;
    }
}
