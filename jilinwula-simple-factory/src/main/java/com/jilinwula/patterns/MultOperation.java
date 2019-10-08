package com.jilinwula.patterns;

/**
 * 乘法运算类
 */
public class MultOperation extends AbstractOperation {
    @Override
    public int count() {
        return super.a * super.b;
    }
}
