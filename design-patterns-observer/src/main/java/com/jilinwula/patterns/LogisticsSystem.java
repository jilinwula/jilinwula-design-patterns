package com.jilinwula.patterns;

/**
 * 物流系统
 */
public class LogisticsSystem implements SystemObserver {


    public void receiveSubjectNotify(String subject) {
        System.out.println(String.format("物流系统收到订单更新	%s", subject));

    }
}
