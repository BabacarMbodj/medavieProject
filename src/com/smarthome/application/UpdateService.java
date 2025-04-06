package com.smarthome.application;

import com.smarthome.domain.Appliance;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class UpdateService {
    private final List<Appliance> appliances;

    public UpdateService(List<Appliance> appliances) {

        this.appliances = appliances;
    }

    public void checkAndUpdate() {
        LocalDateTime now =  LocalDateTime.now();

        if (now.getMonth() == Month.JANUARY &&
            now.getDayOfMonth() == 1 &&
            now.getHour() == 1 &&
            now.getMinute() == 0) {

            System.out.println("\nInitiating the update of the system");
          /*   for (Appliance appliance : appliances) {
                appliance.turnOff();
            }*/
            try
            {
                appliances.forEach(appliance -> appliance.turnOff());
                System.out.println("All appliances turned off for system update.");
                System.out.println("[System Update Completed]\n");
            }
            catch(Exception e)
            {
                System.out.println("An error occured, the system will try to update later");
                System.out.println("error: "+e);
            }
            

           
        } else {
            System.out.println("No update required at this time.");
        }
    }
}
