package com.robjectra;

import com.robjectra.builder.Product;

public class Builder {
    public static void run() {
        System.out.println("welcome to builder");

        // only required fields
        Product shirt = new Product.ProductBuilder("shirt", 543.50).build();
        System.out.println(shirt);

        // required + optional fields
        Product soap = new Product.ProductBuilder("soap", 90.20)
                .setCategory("grocery")
                .setDescription("soap is very good")
                .setDiscount(10.0)
                .setStock(100)
                .build();
        System.out.println(soap);
    }
}
