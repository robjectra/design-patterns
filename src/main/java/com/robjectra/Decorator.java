package com.robjectra;

import com.robjectra.decorator.MilkCoffee;
import com.robjectra.decorator.PlainCoffee;
import com.robjectra.decorator.SugarCoffee;

public class Decorator {
    public static void run() {
        System.out.println("welcome to decorator");
        // plane coffee
        PlainCoffee plainCoffee = new PlainCoffee();
        System.out.println(plainCoffee.description() + "  Price : " + plainCoffee.price());

        // milk coffee
        MilkCoffee milkCoffee = new MilkCoffee(plainCoffee);
        System.out.println(milkCoffee.description() + "  Price : " + milkCoffee.price());

        // sugar coffee
        SugarCoffee sugarCoffee = new SugarCoffee(plainCoffee);
        System.out.println(sugarCoffee.description() + "  Price : " + sugarCoffee.price());

    }
}
