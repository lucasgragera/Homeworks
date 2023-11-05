package models;

import models.interfaces.IVehicle;

import java.util.Objects;

public class Citroen extends MotorVehicle implements IVehicle {
    public Citroen(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Citroen class");
    }

    @java.lang.Override
    public void vehicle() {
        System.out.println("Citroen is a Vehicle");
    }
}