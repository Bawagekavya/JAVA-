package com.xwork.java.runner;

import com.xwork.java.interfaces.Paymentgateway;

public class PaymentgatewayRunner {

    public static void main(String[] args) {

        Paymentgateway paymentgateway = (a,b) -> {

            return a+b;
        };

        double totalpayment = paymentgateway.makePayment(120494.2,873465.12);
        System.out.println("TotalPayment :"+ totalpayment);
    }
}
