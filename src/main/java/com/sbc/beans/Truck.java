package com.sbc.beans;

import org.springframework.stereotype.Component;

@Component
public class Truck {
    private String manufacturerName;
    Truck(){
        System.out.println("Truck instantiated");
    }
}
