package com.jilinwula.patterns;

import lombok.Data;

@Data
public class Message {

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 类型:站内信 桌面通知
     */
    private String type;
}
