package com.jilinwula;

public class Fish extends SideDish {

    private Food food;

    public Fish(Food food) {
        this.food = food;
    }

    @Override
    public int price() {
        return food.price() + 300;
    }
}
