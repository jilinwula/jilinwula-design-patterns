package com.jilinwula.patterns;

import lombok.Data;

/**
 * 运算类
 */
@Data
public abstract class AbstractOperation {
    public int a;
    public int b;

    public int count() {
        return 0;
    }
}
