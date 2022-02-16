package com.jkuat.dit.loose.coupling;

import com.jkuat.dit.Transport;

public class Motorbike implements Transport {
    @Override
    public void start() {
        System.out.println("Motorbike trip started...");
    }
}
