package com.jilinwula.patterns.hsinking;

/**
 * 汽车工厂类
 */
public class AutomobileFactory {
    public Automobile productionAutomobile(Class classes) {
        try {
            return (Automobile) Class.forName(classes.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
