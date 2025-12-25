package com.robjectra.decorator;

public class SugarCoffee extends CoffeeDecorator{

    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + " Extra Sugar.";
    }

    @Override
    public Double price() {
        return super.price() + 20.00;
    }
}
