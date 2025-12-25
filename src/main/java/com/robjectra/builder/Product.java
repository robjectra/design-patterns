package com.robjectra.builder;

public class Product {

    // required fields
    private String name;
    private Double price;

    // optional fields
    private String category;
    private  String description;
    private Integer stock;
    private  Double discount;

    private Product(ProductBuilder productBuilder) {
        this.name = productBuilder.name;
        this.price = productBuilder.price;
        this.category = productBuilder.category;
        this.description = productBuilder.description;
        this.stock = productBuilder.stock;
        this.discount = productBuilder.discount;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", discount=" + discount +
                '}';
    }

    public static class ProductBuilder {
        // required fields
        private final String name;
        private final Double price;

        // optional fields
        private String category;
        private  String description;
        private Integer stock;
        private  Double discount;

        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setStock(Integer stock) {
            this.stock = stock;
            return this;

        }

        public ProductBuilder setDiscount(Double discount) {
            this.discount = discount;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }
}
