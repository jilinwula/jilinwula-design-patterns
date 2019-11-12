package com.jilinwula.patterns;

import lombok.Data;

/**
 * 打折折扣
 */
@Data
public class RateDiscount extends AbstractDiscount {

    /**
     * 打多少折
     */
    private double rate;

    public RateDiscount(double rate) {
        this.rate = rate;
    }

    public double payAmount(double orderPrice) {

        return orderPrice * rate;
    }
}
