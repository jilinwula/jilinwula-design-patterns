package com.jilinwula.patterns;

public abstract class AbstractMessageTemplate {
    public Message sendMessage() {
        Message message = new Message();
        message.setTitle("你有一条新消息请查收");
        message.setContent(String.format("恭喜用户【%S】获取优惠卷一张", setMessageUser()));
        return message;
    }

    protected abstract String setMessageUser();
}
