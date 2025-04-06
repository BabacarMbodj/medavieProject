package com.smarthome.infrastructure.devices;

import com.smarthome.domain.Appliance;

public class AirConditioner implements Appliance {
    private String mode; // off, cool, heat

    @Override
    public void turnOn() {
        setMode("cool");
        System.out.println("AC mode set to COOL.");
    }

    @Override
    public void turnOff() {
        setMode("off");
        System.out.println("AC mode set to OFF.");
    }

    // Getter and Setter for mode
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
