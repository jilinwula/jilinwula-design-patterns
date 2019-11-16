package com.jilinwula.patterns;

/**
 * 观察者接口
 */
public interface SystemObserver {

    /**
     * 接受主题通知
     * @param subject
     */
    public void receiveSubjectNotify(String subject);
}
