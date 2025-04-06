package com.smarthome.infrastructure.devices;

import com.smarthome.domain.Appliance;

public class Light implements Appliance {
    private boolean isOn;

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light switch toggled to OFF.");
    }

    // Getter and Setter for isOn
    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
}
