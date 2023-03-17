package com.kh.day16.d;

public class ShoppingBasket {
    private Fruit fruit;

    public void put(Fruit fruit) {
        this.fruit = fruit;
    }

    public void remove() {
        this.fruit = null;
    }

    public Fruit get() {
        return this.fruit;
    }
}



