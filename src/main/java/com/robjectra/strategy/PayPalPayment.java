package com.robjectra.strategy;

public class PayPalPayment implements Payment{
    @Override
    public boolean pay(Integer amount) {
        System.out.println("PayPalPayment : " + amount);
        return false;
    }
}
