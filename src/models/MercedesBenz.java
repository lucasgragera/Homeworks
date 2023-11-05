package models;

import models.interfaces.IEnjoy;

public class MercedesBenz extends MotorVehicle implements IEnjoy {
    public MercedesBenz(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from MercedesBenz class");
    }

    @java.lang.Override
    public void enjoy() {
        System.out.println("You enjoy while driving a MercedesBenz");
    }
}