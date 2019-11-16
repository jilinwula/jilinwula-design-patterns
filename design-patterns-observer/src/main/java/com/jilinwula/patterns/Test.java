package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) {
        OrderSuccess orderSuccess = new OrderSuccess();

        LogisticsSystem logisticsSystem = new LogisticsSystem();
        GoodsSystem goodsSystem = new GoodsSystem();
        IntegralSystem integralSystem = new IntegralSystem();

        orderSuccess.addObserver(logisticsSystem);
        orderSuccess.addObserver(goodsSystem);
        orderSuccess.addObserver(integralSystem);

        orderSuccess.notifyObserver();
    }
}
