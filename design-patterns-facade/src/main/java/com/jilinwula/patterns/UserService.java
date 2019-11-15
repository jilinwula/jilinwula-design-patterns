package com.jilinwula.patterns;

/**
 * 用户服务
 */
public class UserService {

    private OrderService orderService;

    private AccountService accountService;

    private IntegralService integralService;


    public UserService() {
        orderService = new OrderService();
        accountService = new AccountService();
        integralService = new IntegralService();
    }

    public void buy() {
        orderService.createOrder();
        accountService.deductMoney();
        integralService.addIntegral();
    }

    public void retreat() {
        orderService.cancelOrder();
        accountService.backMoney();
        integralService.decreaseIntegral();
    }
}
