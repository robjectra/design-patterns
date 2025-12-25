package com.robjectra.strategy;

public class PaymentService implements Payment{

    private Payment payment;

    public PaymentService(Payment payment){
        this.payment = payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public boolean pay(Integer amount) {
        System.out.println("in payment Service : " + amount);
        payment.pay(amount);
        return true;
    }
}
