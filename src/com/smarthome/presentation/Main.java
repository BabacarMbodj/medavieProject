package com.smarthome.presentation;

import java.util.Arrays;
import java.util.List;

import com.smarthome.domain.Appliance;
import com.smarthome.infrastructure.devices.Light;
import com.smarthome.infrastructure.devices.Fan;
import com.smarthome.infrastructure.devices.AirConditioner;



public class Main {
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AirConditioner();

        List<Appliance> appliances = Arrays.asList(light, fan, ac);

        // Testing to turn On then Off each appliance

        appliances.forEach(appliance -> 
        {
            appliance.turnOn();
            appliance.turnOff();
        }
    );

       
    }
}