package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @Autowired
    @Qualifier("phonePay")
    private Payment pay1;

    @Autowired
    @Qualifier("googlePay")
    private Payment pay2;

    public Payment getPay1() {
        return pay1;
    }

    public Payment getPay2() {
        return pay2;
    }
}