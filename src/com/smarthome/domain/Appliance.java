package com.smarthome.domain;

/*
 * Appliance will be our interface that will be implemented by our different appliances
 * each appliance will override the tunrOn() and turnOff() methods 
 */
public interface Appliance {

    void turnOn();
    void turnOff();
    
}
