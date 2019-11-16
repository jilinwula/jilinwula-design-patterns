package com.jilinwula.patterns;

/**
 * 商品系统
 */
public class GoodsSystem implements SystemObserver {

    public void receiveSubjectNotify(String subject) {
        System.out.println(String.format("商品系统收到订单更新	%s", subject));

    }
}
