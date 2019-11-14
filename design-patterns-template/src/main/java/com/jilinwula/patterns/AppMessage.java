package com.jilinwula.patterns;

public class AppMessage extends AbstractMessageTemplate {
    @Override
    public Message sendMessage() {
        Message message = super.sendMessage();
        message.setType("站内信");
        return message;
    }

    @Override
    protected String setMessageUser() {
        return "米带";
    }
}
