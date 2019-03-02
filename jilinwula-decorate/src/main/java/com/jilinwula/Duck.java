package com.jilinwula;

public class Duck extends SideDish {

    private Food food;

    public Duck(Food food) {
        this.food = food;
    }

    @Override
    public int price() {
        return food.price() + 200;
    }
}
