package com.jilinwula.patterns;

/**
 * 除法运算类
 */
public class DivideOperation extends AbstractOperation {
    @Override
    public int count() {
        return super.a / super.b;
    }
}
