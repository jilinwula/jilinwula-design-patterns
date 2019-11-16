package com.jilinwula.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单支付成功
 */
public class OrderSuccess implements OrderSubject {

    // 保存所有观察者对象列表
    private List<SystemObserver> systemObservers;


    public OrderSuccess() {
        systemObservers = new ArrayList<SystemObserver>();
    }

    /**
     * 将新的观察者对象保存到观察者对象列表中
     */
    public void addObserver(SystemObserver observer) {
        systemObservers.add(observer);
    }

    /**
     * 将当前的观察者对象从观察者对象列表中删除
     */
    public void removeObserver(SystemObserver observer) {
        systemObservers.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObserver() {
        String order = "新的支付成功订单编号为：20171125202644";
        for (SystemObserver observer : systemObservers) {
            observer.receiveSubjectNotify(order);
        }
    }
}
