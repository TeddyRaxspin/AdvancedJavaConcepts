package com.jkuat.dit.loose.coupling;

import com.jkuat.dit.Transport;

public class Train implements Transport {
    @Override
    public void start() {
        System.out.println("Train trip started...");
    }
}
