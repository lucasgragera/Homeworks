package models;

import models.interfaces.IDrive;

import java.util.Objects;

public class Audi extends MotorVehicle implements IDrive {

    public Audi(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Audi class");
    }

    @java.lang.Override
    public void drive() {
        System.out.println("You can drive an Audi");
    }
}
