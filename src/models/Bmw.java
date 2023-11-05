package models;

import java.util.Objects;

public class Bmw extends MotorVehicle{

    // Constructor with parameters
    public Bmw(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Bmw class");
    }
}