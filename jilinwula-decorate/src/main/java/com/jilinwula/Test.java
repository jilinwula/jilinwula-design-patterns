package com.jilinwula;

public class Test {
    public static void main(String[] args) {
        Food food = new HotPot();

        SideDish sideDish = new Chicken(new Duck(new Fish(food)));

        System.out.println(sideDish.price());
    }
}
