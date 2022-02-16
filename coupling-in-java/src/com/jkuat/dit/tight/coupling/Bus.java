package com.jkuat.dit.tight.coupling;

import com.jkuat.dit.Transport;

public class Bus implements Transport {

    @Override
    public void start() {
        System.out.println("Bus trip started");
    }
}
