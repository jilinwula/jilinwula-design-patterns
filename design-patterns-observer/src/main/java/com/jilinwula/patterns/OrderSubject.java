package com.jilinwula.patterns;

/**
 * 主题接口
 */
public interface OrderSubject {

    /**
     * 添加一个观察者
     * @param observer
     */
    public void addObserver(SystemObserver observer);

    /**
     * 删除一个观察者
     * @param observer
     */
    public void removeObserver(SystemObserver observer);

    /**
     * 当主题变化时调用此方法通知所有观察者
     */
    public void notifyObserver();
}
