package com.jilinwula.patterns;

public class DesktopMessage extends AbstractMessageTemplate {
    @Override
    public Message sendMessage() {
        Message message = super.sendMessage();
        message.setType("桌面通知");
        return message;
    }

    @Override
    protected String setMessageUser() {
        return "欧了";
    }
}
