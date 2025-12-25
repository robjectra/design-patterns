package com.robjectra;

import com.robjectra.strategy.*;

public class Strategy {
    public static void run() {
        System.out.println("welcome to strategy");
        PaymentService paymentService = new PaymentService(new BankPayment());
        paymentService.pay(1200);

        paymentService = new PaymentService(new PayPalPayment());
        paymentService.pay(1500);

        paymentService = new PaymentService(new CreditCardPayment());
        paymentService.pay(100);


    }
}
