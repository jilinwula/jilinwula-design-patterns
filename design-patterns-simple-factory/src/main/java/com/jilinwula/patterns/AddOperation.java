package com.jilinwula.patterns;

/**
 * 加法运算类
 */
public class AddOperation extends AbstractOperation {
    @Override
    public int count() {
        return super.a + super.b;
    }
}
