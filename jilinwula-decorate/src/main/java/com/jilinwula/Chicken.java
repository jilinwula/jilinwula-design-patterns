package com.jilinwula;

public class Chicken extends SideDish {

    private Food food;

    public Chicken(Food food) {
        this.food = food;
    }

    @Override
    public int price() {
        return food.price() + 100;
    }
}
