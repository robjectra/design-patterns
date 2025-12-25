package com.robjectra.decorator;

public class PlainCoffee implements Coffee{

    @Override
    public String description() {
        return "Coffee contains warm water and coffee.";
    }

    @Override
    public Double price() {
        return 10.0;
    }


}
