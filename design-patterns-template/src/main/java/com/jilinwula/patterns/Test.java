package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        AppMessage appMessage = new AppMessage();
        System.out.println(appMessage.sendMessage());

        DesktopMessage desktopMessage = new DesktopMessage();
        System.out.println(desktopMessage.sendMessage());
    }
}
