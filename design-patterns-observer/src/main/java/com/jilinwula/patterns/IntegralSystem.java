package com.jilinwula.patterns;

/**
 * 积分系统
 */
public class IntegralSystem implements SystemObserver {

    public void receiveSubjectNotify(String subject) {
        System.out.println(String.format("积分系统收到订单更新	%s", subject));

    }
}
