package com.robjectra.decorator;

public class MilkCoffee extends CoffeeDecorator{

    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return coffee.description() + " Extra Milk.";
    }

    @Override
    public Double price() {
        return coffee.price() + 20.00;
    }
}
