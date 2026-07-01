package com.tka;

import org.springframework.stereotype.Component;

@Component
public class PhonePay implements Payment {

    @Override
    public String payment() {
        return "Payment done using PhonePay";
    }
}