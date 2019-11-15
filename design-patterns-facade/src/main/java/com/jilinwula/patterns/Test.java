package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        // 购买
        userService.buy();
        // 退货
        userService.retreat();
    }
}
