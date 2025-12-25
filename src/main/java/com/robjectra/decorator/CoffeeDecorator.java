package com.robjectra.decorator;

public abstract class CoffeeDecorator extends PlainCoffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
