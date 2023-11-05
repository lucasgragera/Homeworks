package models;

import models.interfaces.ITravel;

public class Honda extends MotorVehicle implements ITravel {

    // Constructor with parameters
    public Honda(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Honda class");
    }

    @java.lang.Override
    public void travel() {
        System.out.println("You can travel comfortably in a Honda");
    }
}