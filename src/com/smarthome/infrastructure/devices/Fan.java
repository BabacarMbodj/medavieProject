package com.smarthome.infrastructure.devices;

import com.smarthome.domain.Appliance;

public class Fan implements Appliance {
    private int speed; // 0 = off, 1 = low, 2 = high

    @Override
    public void turnOn() {
        setSpeed(1);
        System.out.println("Fan is set to speed " + getSpeed());
    }

    @Override
    public void turnOff() {
        setSpeed(0);
        System.out.println("Fan speed set to 0 (OFF).");
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
