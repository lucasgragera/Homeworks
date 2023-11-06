package models;

import models.interfaces.IRace;

import java.util.Objects;

public class Bmw extends MotorVehicle implements IRace {

    // Constructor with parameters
    public Bmw(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Bmw class");
    }

    @Override
    public void vehicle() {

    }

    @java.lang.Override
    public void race() {
        System.out.println("You can race in a Bmw");
    }
}