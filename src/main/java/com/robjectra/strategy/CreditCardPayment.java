package com.robjectra.strategy;

public class CreditCardPayment implements Payment{
    @Override
    public boolean pay(Integer amount) {
        System.out.println("CreditCardPayment : " + amount);
        return false;
    }
}
