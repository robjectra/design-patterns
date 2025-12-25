package com.robjectra.strategy;

public class BankPayment implements Payment{
    @Override
    public boolean pay(Integer amount) {
        System.out.println("BankPayment : " + amount);
        return false;
    }
}
