package com.jilinwula.patterns;

/**
 * 减法运算类
 */
public class SubOperation extends AbstractOperation {
    @Override
    public int count() {
        return super.a - super.b;
    }
}
